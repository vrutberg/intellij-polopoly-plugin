package com.polopoly.intellij.dotcontent;

import java.io.Reader;

import com.intellij.lexer.FlexAdapter;

/**
 * Created with IntelliJ IDEA.
 * User: vrutberg
 * Date: 27/02/14
 * Time: 15:50
 * To change this template use File | Settings | File Templates.
 */
public class DotContentLexerAdapter extends FlexAdapter
{
    public DotContentLexerAdapter()
    {
        super(new DotContentLexer((Reader)null));
    }
}
