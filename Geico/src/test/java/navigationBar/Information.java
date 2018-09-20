package navigationBar;

import base.BeforeNAfterMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Information extends BeforeNAfterMethods {
    @Test
    public void clickOnInformation() {
        WebElement information = ((ChromeDriver) driver).findElementByCssSelector("ul.desktop-links > li:nth-child(2)>a");
        information.click();
        WebElement information1 = ((ChromeDriver) driver).findElementByCssSelector("#header-left-links > ul > li > a");
        information1.click();
    }
}
