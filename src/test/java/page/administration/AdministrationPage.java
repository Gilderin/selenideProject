package page.administration;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AdministrationPage {
    private By HEADERPAGESELECTOR = By.xpath("//h1[. = 'Administration']");
    private By PROJECTLINKSELECTOR = By.xpath("//div[@class = 'info-box-title']/a[. = 'Projects']");

    public boolean isPageOpened() {
        return $(HEADERPAGESELECTOR).isDisplayed();
    }

    public ProjectsPage projectLinkClick() {
        $(PROJECTLINKSELECTOR).click();
        return new ProjectsPage();
    }
}
