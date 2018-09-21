package navigationBar;

import base.BeforeNAfterMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NavigationBar extends BeforeNAfterMethods {
    @Test
    public void testNavigationBar() {
        WebElement information = ((ChromeDriver) driver).findElementByCssSelector("ul.desktop-links > li:nth-child(2)>a");
        WebElement insurance = driver.findElement(By.cssSelector("#header-left-links > ul> li > a"));
        WebElement geicoLogo = driver.findElement(By.cssSelector("#header-middle-links > a"));
        WebElement location = driver.findElement(By.cssSelector("#header-right-links>ul>li>a>span.icon-geolocation"));
        WebElement login = driver.findElement(By.cssSelector("#header-right-links>ul>li:nth-child(2)>a"));
        WebElement searchIcon = driver.findElement(By.cssSelector("#header-right-links > ul > li:nth-child(3) > a > span"));

        Actions builder = new Actions(driver);
        builder.moveByOffset(information.getLocation().getX()+1, information.getLocation().getY()+1).click();
        builder.pause(3000);
        builder.moveToElement(insurance).click();
        builder.pause(3000);
        builder.moveToElement(location).click();
        builder.pause(3000);
        builder.moveToElement(login).click();
        builder.pause(3000);
        builder.moveToElement(searchIcon).click();
        builder.pause(3000);
        builder.moveToElement(geicoLogo).click();
        builder.pause(3000);

        builder.build().perform();
    }
}
