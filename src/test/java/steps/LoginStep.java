package steps;


import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import page.LoginPage;

import static com.codeborne.selenide.Selenide.$;

public class LoginStep {


    @Step
    public void login(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.setEmail(username);
        loginPage.setPassword(password);
        loginPage.loginButtonClick();
        $(".page_title").shouldHave(Condition.text("All Projects"));
    }

}
