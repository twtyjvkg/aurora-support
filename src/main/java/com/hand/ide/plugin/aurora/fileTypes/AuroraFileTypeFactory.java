package com.hand.ide.plugin.aurora.fileTypes;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * @author xuzhao
 * @email mailto:xuzhao@feline.net
 * @description 定义Aurora文件类型工厂
 * @time 2018/12/21 13:04
 */
public class AuroraFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(ScreenFileType.INSTANCE);
        consumer.consume(SvcFileType.INSTANCE);
        consumer.consume(BmFileType.INSTANCE);
    }
}
