package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    private By ADDPROJECTSELECTOR = By.id("sidebar-projects-add");

    public AddProjectPage addProjectButtonClick() {
        $(ADDPROJECTSELECTOR).click();
        return new AddProjectPage();
    }

}
