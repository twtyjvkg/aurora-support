package com.hand.ide.plugin.aurora.actions;

import com.hand.ide.plugin.aurora.fileTemplates.AuroraFileTemplateProvider;
import com.hand.ide.plugin.aurora.icons.AuroraIcons;
import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiDirectory;

import javax.swing.*;

/**
 * @author xuzhao
 * @email mailto:xuzhao@feline.net
 * @description
 * @time 2018/12/21 15:55
 */
public class CreateScreenFileAction extends CreateFileFromTemplateAction implements DumbAware {

    public CreateScreenFileAction() {
        super("Screen File", "Create New Screen File", AuroraIcons.SCREEN);
    }

    @Override
    protected void buildDialog(Project project, PsiDirectory directory, CreateFileFromTemplateDialog.Builder builder) {
        builder.setTitle("New Screen File")
                .addKind("Screen File", AuroraIcons.SCREEN, AuroraFileTemplateProvider.SCREEN_FILE_TEMPLATE);
    }

    @Override
    protected String getActionName(PsiDirectory directory, String newName, String templateName) {
        return "Screen File";
    }
}
