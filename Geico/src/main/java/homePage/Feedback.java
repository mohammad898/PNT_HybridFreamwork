package homePage;

import base.CommonClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Feedback extends CommonClass {
    @FindBy(id = "oo_tab")
    public WebElement feedbackTab;
    /*@FindBy(className = "screen_reader")
    public WebElement feedbackSpan;*/
  /*  @FindBy(name = "OnlineOpinion1")
    public WebElement iframe;*/
    @FindBy(xpath = "//iframe")
    public WebElement iframe;
    @FindBy(xpath = "//label[@for='overall_0']")
    public WebElement veryDissatisfied;
    @FindBy(xpath = "//div[@id='foot']/button")
    public static WebElement submitButton;
    public void switchToFrame(){
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
        feedbackTab.click();
    }
    public void clickVeryDissatisfied(){
        veryDissatisfied.click();
    }
    public void clickSubmit(){
        submitButton.click();
    }
    public void giveFeedback(){
        switchToFrame();
        clickVeryDissatisfied();
        clickSubmit();
        driver.switchTo().defaultContent();
    }
}
