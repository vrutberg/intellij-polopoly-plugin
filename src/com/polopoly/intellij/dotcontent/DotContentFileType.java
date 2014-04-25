package com.polopoly.intellij.dotcontent;

import com.intellij.openapi.fileTypes.LanguageFileType;
import javax.swing.Icon;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DotContentFileType extends LanguageFileType
{
    public static final DotContentFileType INSTANCE = new DotContentFileType();

    private DotContentFileType() {
        super(DotContentLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName()
    {
        return "Dot Content";
    }

    @NotNull
    @Override
    public String getDescription()
    {
        return "Polopoly Dot Content File";
    }

    @NotNull
    @Override
    public String getDefaultExtension()
    {
        return "content";
    }

    @Nullable
    @Override
    public Icon getIcon()
    {
        return DotContentIcon.FILE;
    }
}
