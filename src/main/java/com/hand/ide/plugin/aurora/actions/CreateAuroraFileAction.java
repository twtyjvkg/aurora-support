package com.hand.ide.plugin.aurora.actions;

import com.hand.ide.plugin.aurora.fileTemplates.AuroraFileTemplateProvider;
import com.hand.ide.plugin.aurora.icons.AuroraIcons;
import com.hand.ide.plugin.aurora.utils.CommonUtil;
import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.ide.fileTemplates.FileTemplate;
import com.intellij.ide.fileTemplates.FileTemplateManager;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiFile;

/**
 * @author xuzhao
 * @email mailto:xuzhao@feline.net
 * @description 创建Aurora文件
 * @time 2018/12/21 15:55
 */
public class CreateAuroraFileAction extends CreateFileFromTemplateAction implements DumbAware  {

    public CreateAuroraFileAction() {
        super("Aurora File", "Create New Aurora File", AuroraIcons.AURORA);
    }

    @Override
    protected void buildDialog(Project project, PsiDirectory directory, CreateFileFromTemplateDialog.Builder builder) {
        builder.setTitle("New Aurora File")
                .addKind("Screen File", AuroraIcons.SCREEN, AuroraFileTemplateProvider.SCREEN_FILE_TEMPLATE)
                .addKind("SVC File", AuroraIcons.SVC, AuroraFileTemplateProvider.SVC_FILE_TEMPLATE)
                .addKind("BM File", AuroraIcons.BM, AuroraFileTemplateProvider.BM_FILE_TEMPLATE);
    }

    @Override
    protected String getActionName(PsiDirectory directory, String newName, String templateName) {
        return "Aurora File";
    }

    @Override
    protected PsiFile createFile(String name, String templateName, PsiDirectory dir) {

        final FileTemplate template = FileTemplateManager.getInstance(dir.getProject()).getInternalTemplate(templateName);
        return createFileFromTemplate(templateName.equalsIgnoreCase(
                // screen文件使用下划线命名法
                "ScreenFile") ? CommonUtil.camel2Underline(name) : name, template, dir);
    }
}
