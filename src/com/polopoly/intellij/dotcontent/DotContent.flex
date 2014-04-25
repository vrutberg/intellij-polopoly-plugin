package com.polopoly.intellij.dotcontent;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.polopoly.intellij.dotcontent.psi.DotContentTypes;
import com.intellij.psi.TokenType;

%%

%class DotContentLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF= \n|\r|\r\n
WHITE_SPACE=[\ \t\f]
VALUE_CHARACTER=[^\n\r\f:]*
END_OF_LINE_COMMENT=("#")[^\r\n]*
SEPARATOR=[:]
KEY_CHARACTER=[^:\ \n\r\t\f\\]+

%state WAITING_VALUE
%state WAITING_PATH

%%

<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return DotContentTypes.COMMENT; }

<YYINITIAL> {KEY_CHARACTER}                                 { yybegin(YYINITIAL); return DotContentTypes.KEY; }

<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_PATH); return DotContentTypes.SEPARATOR; }

<WAITING_PATH> ({KEY_CHARACTER}{SEPARATOR})+                { yybegin(WAITING_VALUE); return DotContentTypes.COMPONENTPATH; }

<WAITING_PATH> {VALUE_CHARACTER}                            { yybegin(YYINITIAL); return DotContentTypes.VALUE; }

<WAITING_VALUE> {VALUE_CHARACTER}                           { yybegin(YYINITIAL); return DotContentTypes.VALUE; }

{CRLF}                                                      { yybegin(YYINITIAL); return DotContentTypes.CRLF; }

{WHITE_SPACE}+                                              { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

.                                                           { return TokenType.BAD_CHARACTER; }