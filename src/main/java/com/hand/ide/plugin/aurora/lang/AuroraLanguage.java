package com.hand.ide.plugin.aurora.lang;

import com.intellij.lang.xml.XMLLanguage;

/**
 * @author xuzhao
 * @email mailto:xuzhao@feline.net
 * @description 定义Aurora语言类型
 * @time 2018/12/21 12:47
 */
public class AuroraLanguage extends XMLLanguage {

    public static final AuroraLanguage INSTANCE = new AuroraLanguage();

    private AuroraLanguage() {
        super(XMLLanguage.INSTANCE, "Aurora", "text/xhtml", "application/xhtml+xml");
    }
}
