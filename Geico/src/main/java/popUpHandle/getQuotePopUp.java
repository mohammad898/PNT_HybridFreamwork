package popUpHandle;

import base.CommonClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class getQuotePopUp extends CommonClass {
    @FindBy(xpath = "//div[@class='card-selections-card card-selections-selected']/label")
    public static WebElement firstQuote;
    @FindBy(xpath = "//div[@class='button-bar']//button[@class='btn btn--primary btn--full-mobile']")
    public static WebElement getQuoteButton;
    @FindBy(css = ".skip-collect-intent.link--primary")
    public static WebElement skipButton;
    public void navigate() {
        driver.navigate().to("https://auto-buy.geico.com/nb#/sale/customerinformation/gskmsi");
    }
    public void waitToBeVisible(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']//div[@class='card-selections']")));
    }
    public void getQuote(){
        navigate();
        waitToBeVisible();
        firstQuote.click();
        getQuoteButton.click();
    }
    public void clickSkip(){
        navigate();
        waitToBeVisible();
        skipButton.click();
    }
}
