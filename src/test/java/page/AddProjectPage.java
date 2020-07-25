package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class AddProjectPage {
    private By ADDPROJECTBUTTONSELECTOR = By.id("accept");
    private By NAMESELECTOR = By.id("name");
    private By SUITEMODESINGLESELECTOR = By.id("suite_mode_single");
    private By SUITEMODESINGLEBASELINESELECTOR = By.id("suite_mode_single_baseline");
    private By SUITEMODEMULTISELECTOR = By.id("suite_mode_multi");

    public void addProjectButtonClick() {
        $(ADDPROJECTBUTTONSELECTOR).scrollIntoView(true);
        $(ADDPROJECTBUTTONSELECTOR).click();
    }

    public void insertProjectName(String nameProject) {
        $(NAMESELECTOR).setValue(nameProject);
    }

    public void suiteModeSingleOptionClick() {
        $(SUITEMODESINGLESELECTOR).click();
    }

    public void suiteModeSingleBaselineOptionClick() {
        $(SUITEMODESINGLEBASELINESELECTOR).click();
    }

    public void suiteModeMultiOptionClick() {
        $(SUITEMODEMULTISELECTOR).click();
    }
}
