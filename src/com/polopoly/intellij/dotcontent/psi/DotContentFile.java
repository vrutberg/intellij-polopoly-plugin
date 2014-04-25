package com.polopoly.intellij.dotcontent.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.polopoly.intellij.dotcontent.DotContentFileType;
import com.polopoly.intellij.dotcontent.DotContentLanguage;
import javax.swing.Icon;
import org.jetbrains.annotations.NotNull;

public class DotContentFile extends PsiFileBase
{
    public DotContentFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, DotContentLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return DotContentFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Dot Content File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
