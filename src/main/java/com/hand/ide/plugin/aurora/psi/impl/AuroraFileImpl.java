package com.hand.ide.plugin.aurora.psi.impl;

import com.hand.ide.plugin.aurora.lang.AuroraLanguage;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.impl.source.html.ScriptSupportUtil;
import com.intellij.psi.impl.source.xml.XmlFileImpl;
import com.intellij.psi.scope.PsiScopeProcessor;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

/**
 * @author xuzhao
 * @email mailto:xuzhao@feline.net
 * @description
 * @time 2018/12/21 15:09
 */
public class AuroraFileImpl extends XmlFileImpl {

    public AuroraFileImpl(FileViewProvider viewProvider, IElementType elementType) {
        super(viewProvider, elementType);
    }

    private boolean isAuroraFileType() {
        return getLanguage() == AuroraLanguage.INSTANCE;
    }

    @Override
    public void clearCaches() {
        super.clearCaches();

        if (isAuroraFileType()) {
            ScriptSupportUtil.clearCaches(this);
        }
    }

    @Override
    public boolean processDeclarations(@NotNull PsiScopeProcessor processor, @NotNull ResolveState state, PsiElement lastParent, @NotNull PsiElement place) {
        return super.processDeclarations(processor, state, lastParent, place) &&
                (!isAuroraFileType() || ScriptSupportUtil.processDeclarations(this, processor, state, lastParent, place));

    }
}
