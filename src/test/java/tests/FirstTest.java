package tests;

import com.codeborne.selenide.Config;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
public class FirstTest {
    @Test
    public void loginTestRail(){
        org.apache.log4j.BasicConfigurator.configure();
        Configuration.baseUrl="https://aqa5master.testrail.io/";
        Configuration.startMaximized=true;
        Configuration.browser="firefox";
        open("/");
        $(By.id("name")).setValue("atrostyanko+master@gmail.com");
        $(By.id("password")).setValue("QqtRK9elseEfAk6ilYcJ");
        $(By.id("button_primary")).click();
        $(".page_title").shouldBe(visible);
        $(".page_title").shouldHave(text("All Projects"));
    }
}
