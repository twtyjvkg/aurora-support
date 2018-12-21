package com.hand.ide.plugin.aurora.lang;

import com.hand.ide.plugin.aurora.psi.AuroraElementType;
import com.hand.ide.plugin.aurora.psi.impl.AuroraFileImpl;
import com.intellij.lang.xml.XMLParserDefinition;
import com.intellij.lexer.Lexer;
import com.intellij.lexer.XHtmlLexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

/**
 * @author xuzhao
 * @email mailto:xuzhao@feline.net
 * @description
 * @time 2018/12/21 15:04
 */
public class AuroraParserDefinition extends XMLParserDefinition {

    @Override
    @NotNull
    public Lexer createLexer(Project project) {
        return new XHtmlLexer();
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new AuroraFileImpl(viewProvider, AuroraElementType.AURORA_FILE);
    }

}
