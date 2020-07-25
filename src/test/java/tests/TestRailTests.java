package tests;

import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.administration.ProjectsPage;
import steps.AdministrationStep;
import steps.LoginStep;
import steps.ProjectStep;

import static com.codeborne.selenide.Selenide.*;

public class TestRailTests {

    @Test
    public void login(){
        Configuration.baseUrl="https://aqa5master.testrail.io/";
        Configuration.startMaximized=true;
        open("/");
        LoginStep loginStep =new LoginStep();
        loginStep.login("atrostyanko+master@gmail.com","QqtRK9elseEfAk6ilYcJ");
    }

    @Test(dependsOnMethods = "login")
    public void createProject() {
        ProjectStep projectStep = new ProjectStep();
        projectStep.createNewProject("PR02", "Use a single repository with baseline support");
        Assert.assertTrue(title().equalsIgnoreCase("PR02 - TestRail")
                || title().equalsIgnoreCase("Projects - TestRail"));
    }

    @Test(dependsOnMethods = "createProject")
    public void deleteProject() {
        AdministrationStep administrationStep = new AdministrationStep();
        ProjectsPage projectsPage = administrationStep.deleteProject("PR02");
        Assert.assertEquals(projectsPage.getMessageSuccessText(), "Successfully deleted the project.");
    }
}
