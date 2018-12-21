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
 * @description 定义bm文件类型
 * @time 2018/12/21 13:23
 */
public class BmFileType extends XmlLikeFileType {

    public static final BmFileType INSTANCE = new BmFileType();

    private BmFileType() {
        super(AuroraLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "bm File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Aurora bm file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "bm";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return AuroraIcons.BM;
    }
}
