package com.hand.ide.plugin.aurora.lang;

import com.intellij.ide.highlighter.XmlFileHighlighter;
import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import org.jetbrains.annotations.NotNull;

/**
 * @Author: xuzhao
 * @Email: mailto:contact@xuzhao.xin
 * @Description:
 * @Time: 2018/12/26 9:58
 */
public class AuroraSyntaxHighlighterFactory extends SingleLazyInstanceSyntaxHighlighterFactory {
    @NotNull
    @Override
    protected SyntaxHighlighter createHighlighter() {
        return new XmlFileHighlighter(false, true);
    }
}
