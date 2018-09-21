package navigationBar;

import base.BeforeNAfterMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class NavigationBar extends BeforeNAfterMethods {
    public void testNavigationBar() {
        WebElement information = ((ChromeDriver) driver).findElementByCssSelector("ul.desktop-links > li:nth-child(2)>a");
        WebElement insurance = driver.findElement(By.cssSelector("#header-left-links > ul> li > a"));
        Actions builder = new Actions(driver);
        builder.moveByOffset(information.getLocation().getX() + 1, information.getLocation().getY() + 1).click();
        builder.build().perform();
        builder.pause(5000);
        builder.moveByOffset(-20, 0).click();
        builder.build().perform();
        builder.pause(5000);
    }
}
