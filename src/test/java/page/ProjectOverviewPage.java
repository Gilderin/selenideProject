package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProjectOverviewPage {

    public boolean isPageOpened() {
        return $(By.className("header-menu-item-selected")).getText().equalsIgnoreCase("Overview");
    }
}
