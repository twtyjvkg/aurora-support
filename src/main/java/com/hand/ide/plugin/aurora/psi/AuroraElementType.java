package com.hand.ide.plugin.aurora.psi;

import com.hand.ide.plugin.aurora.lang.AuroraLanguage;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.xml.XmlTokenType;

/**
 * @author xuzhao
 * @email mailto:xuzhao@feline.net
 * @description
 * @time 2018/12/21 15:11
 */
public interface AuroraElementType extends XmlTokenType {

    IFileElementType AURORA_FILE = new IFileElementType(AuroraLanguage.INSTANCE);
}
