package com.hand.ide.plugin.aurora.fileTypes;

import com.hand.ide.plugin.aurora.icons.AuroraIcons;
import com.hand.ide.plugin.aurora.lang.AuroraLanguage;
import com.intellij.ide.highlighter.XmlLikeFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author xuzhao
 * @email mailto:xuzhao@feline.net
 * @description 定义svc文件类型
 * @time 2018/12/21 13:17
 */
public class SvcFileType extends XmlLikeFileType {

    public static final SvcFileType INSTANCE = new SvcFileType();

    private SvcFileType() {
        super(AuroraLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "svc File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Aurora svc file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "svc";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return AuroraIcons.SVC;
    }
}
