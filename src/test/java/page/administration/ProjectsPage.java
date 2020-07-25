package page.administration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;


public class ProjectsPage {
    private By CONFIRMATIONYESCHECKBOXSELECTOR = By.cssSelector("#dialog-ident-deleteDialog input");
    private By CONFIRMATIONOKBUTTONSELECTOR = By.cssSelector("#dialog-ident-deleteDialog .button-ok");
    private By MESSAGESUCCESSSELECTOR = By.className("message-success");

    public void projectItemLinkClick(String projectName) {
        $(By.linkText(projectName)).click();
    }

    public void confirmationYesCheckboxClick() {
        $(CONFIRMATIONYESCHECKBOXSELECTOR).click();
    }

    public void deleteIconClick(String projectName) {
        $(By.linkText(projectName)).parent().parent().find(By.className("icon-small-delete")).click();
    }

    public void confirmationOkButtonClik() {
        $(CONFIRMATIONOKBUTTONSELECTOR).click();
    }

    public String getMessageSuccessText() {
        return $(MESSAGESUCCESSSELECTOR).getText();
    }
}
