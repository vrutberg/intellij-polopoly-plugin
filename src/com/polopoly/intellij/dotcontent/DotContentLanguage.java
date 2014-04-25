package com.polopoly.intellij.dotcontent;

import com.intellij.lang.Language;
import com.intellij.lang.StdLanguages;

public class DotContentLanguage extends Language
{
    public static final DotContentLanguage INSTANCE = new DotContentLanguage();

    private DotContentLanguage() {
        super("DotContent");
    }
}
