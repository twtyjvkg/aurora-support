package com.hand.ide.plugin.aurora.fileTemplates;

import com.hand.ide.plugin.aurora.icons.AuroraIcons;
import com.intellij.ide.fileTemplates.FileTemplateDescriptor;
import com.intellij.ide.fileTemplates.FileTemplateGroupDescriptor;
import com.intellij.ide.fileTemplates.FileTemplateGroupDescriptorFactory;

/**
 * @author xuzhao
 * @email mailto:xuzhao@feline.net
 * @description
 * @time 2018/12/21 16:01
 */
public class AuroraFileTemplateProvider implements FileTemplateGroupDescriptorFactory {

    public static final String SCREEN_FILE_TEMPLATE = "ScreenFile";
    public static final String SVC_FILE_TEMPLATE = "SvcFile";
    public static final String BM_FILE_TEMPLATE = "BmFile";

    @Override
    public FileTemplateGroupDescriptor getFileTemplatesDescriptor() {
        FileTemplateGroupDescriptor group = new FileTemplateGroupDescriptor("Aurora", AuroraIcons.AURORA);
        group.addTemplate(new FileTemplateDescriptor(SCREEN_FILE_TEMPLATE, AuroraIcons.SCREEN));
        group.addTemplate(new FileTemplateDescriptor(SVC_FILE_TEMPLATE, AuroraIcons.SVC));
        group.addTemplate(new FileTemplateDescriptor(BM_FILE_TEMPLATE, AuroraIcons.BM));
        return group;
    }
}
