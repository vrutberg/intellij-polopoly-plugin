package com.polopoly.intellij.dotcontent;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class DotContentElementType extends IElementType
{
    public DotContentElementType(@NotNull @NonNls String debugName) {
        super(debugName, DotContentLanguage.INSTANCE);
    }
}
