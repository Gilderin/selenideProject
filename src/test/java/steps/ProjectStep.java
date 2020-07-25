package steps;

import io.qameta.allure.Step;
import page.AddProjectPage;
import page.DashboardPage;


public class ProjectStep {

    @Step
    public void createNewProject(String name, String type) {
        DashboardPage dashboardPage = new DashboardPage();
        AddProjectPage addProjectPage = dashboardPage.addProjectButtonClick();
        addProjectPage.insertProjectName(name);
        switch (type) {
            case "Use a single repository for all cases (recommended)":
                addProjectPage.suiteModeSingleOptionClick();
                break;
            case "Use a single repository with baseline support":
                addProjectPage.suiteModeSingleBaselineOptionClick();
                break;
            case "Use multiple test suites to manage cases":
                addProjectPage.suiteModeMultiOptionClick();
                break;
        }
        addProjectPage.addProjectButtonClick();
    }
}
