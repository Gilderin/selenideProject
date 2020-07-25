package steps;


import io.qameta.allure.Step;
import page.administration.AdministrationPage;
import page.administration.ProjectsPage;

public class AdministrationStep {

    public AdministrationStep() {
    }

    @Step
    public ProjectsPage deleteProject(String projectName) {
        AdministrationPage administrationPage = new AdministrationPage();
        ProjectsPage projectsPage = administrationPage.projectLinkClick();
        projectsPage.deleteIconClick(projectName);
        projectsPage.confirmationYesCheckboxClick();
        projectsPage.confirmationOkButtonClik();
        return new ProjectsPage();
    }
}
