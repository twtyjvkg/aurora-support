package com.hand.ide.plugin.aurora.fileTypes;

import com.hand.ide.plugin.aurora.lang.AuroraLanguage;
import com.hand.ide.plugin.aurora.icons.AuroraIcons;
import com.intellij.ide.highlighter.XmlLikeFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author xuzhao
 * @email mailto:xuzhao@feline.net
 * @description 定义screen文件类型
 * @time 2018/12/21 13:01
 */
public class ScreenFileType extends XmlLikeFileType {

    public static final ScreenFileType INSTANCE = new ScreenFileType();

    private ScreenFileType() {
        super(AuroraLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Screen File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Aurora screen file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "screen";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return AuroraIcons.SCREEN;
    }
}
