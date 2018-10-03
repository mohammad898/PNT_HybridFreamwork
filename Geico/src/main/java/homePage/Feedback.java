package homePage;

import base.CommonClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Feedback extends CommonClass {

    @FindBy(className="//a[@class='oo_tab_right']")
    public WebElement feedbackTab;
   @FindBy(name = "OnlineOpinion1")
    public WebElement iframe;
    @FindBy(xpath = "//label[@for='overall_0']")
    public WebElement veryDissatisfied;
    @FindBy(xpath = "//div[@id='foot']/button")
    public static WebElement submitButton;
    public void switchToFrame(){

        waitToBeVisible(feedbackTab);
        System.out.println(feedbackTab.getText());
        /*feedbackTab.click();
        waitToBeVisible(iframe);
        driver.switchTo().frame("OnlineOpinion1");*/
       // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
    }
    public void clickVeryDissatisfied(){
        veryDissatisfied.click();
    }
    public void clickSubmit(){
        submitButton.click();
    }
    public void giveFeedback(){

        switchToFrame();
        /*clickVeryDissatisfied();
        clickSubmit();
        driver.switchTo().defaultContent();*/
    }
}
