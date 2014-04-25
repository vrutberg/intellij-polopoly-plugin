package com.polopoly.intellij.dotcontent;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class DotContentTokenType extends IElementType {
    public DotContentTokenType(@NotNull @NonNls String debugName) {
        super(debugName, DotContentLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "DotContentTokenType." + super.toString();
    }
}