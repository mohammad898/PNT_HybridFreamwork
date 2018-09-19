package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class firstTest extends BeforeNAfterMethods{
    @Test
    public void firstTest() {
        WebElement information = ((ChromeDriver) driver).findElementByCssSelector("ul.desktop-links > li:nth-child(2)>a");
        information.click();
     }

}
