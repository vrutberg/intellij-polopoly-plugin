package com.polopoly.intellij.dotcontent;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class DotContentFileTypeFactory extends FileTypeFactory
{
    @Override
    public void createFileTypes(@NotNull final FileTypeConsumer consumer)
    {
        consumer.consume(DotContentFileType.INSTANCE);
    }
}
