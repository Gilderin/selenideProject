package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private String URL = "https://aqa5master.testrail.io/";
    private By EMAILSELECTOR = By.id("name");
    private By PASSWORDSELECTOR = By.id("password");
    private By LOGINBUTTONSELECTOR = By.id("button_primary");

    public boolean isPageOpened() {
        return $(EMAILSELECTOR).isDisplayed();
    }

    public void setEmail(String email) {
        $(EMAILSELECTOR).setValue(email);
    }

    public void setPassword(String password) {
        $(PASSWORDSELECTOR).setValue(password);
    }

    public void loginButtonClick() {
        $(LOGINBUTTONSELECTOR).click();
    }
}
