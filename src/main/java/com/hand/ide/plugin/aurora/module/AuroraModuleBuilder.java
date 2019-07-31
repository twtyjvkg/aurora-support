package com.hand.ide.plugin.aurora.module;

import com.hand.ide.plugin.aurora.icons.AuroraIcons;
import com.intellij.ide.util.projectWizard.JavaModuleBuilder;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * @Author: xuzhao
 * @Email: mailto:support@xuzhao.xin
 * @Description:
 * @Time: 2019/4/17 10:04
 */
public class AuroraModuleBuilder extends JavaModuleBuilder {

    private final String myBuilderId;
    private final String myPresentableName;
    private final String myDescription;

    public AuroraModuleBuilder() {
        this("aurora", "Aurora", "Aurora Project");
    }

    protected AuroraModuleBuilder(String builderId, String presentableName, String description) {
        myBuilderId = builderId;
        myPresentableName = presentableName;
        myDescription = description;
    }

    @Override
    public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext, @NotNull ModulesProvider modulesProvider) {
        return ModuleWizardStep.EMPTY_ARRAY;
    }

    @Override
    public String getBuilderId() {
        return myBuilderId;
    }

    @Override
    public Icon getNodeIcon() {
        return AuroraIcons.AURORA;
    }

    @Override
    public String getDescription() {
        return myDescription;
    }

    @Override
    public String getPresentableName() {
        return myPresentableName;
    }

    @Override
    public String getGroupName() {
        return "Aurora";
    }

    @Override
    public String getParentGroup() {
        return "Aurora";
    }

    @Override
    public int getWeight() {
        return 60;
    }

}
