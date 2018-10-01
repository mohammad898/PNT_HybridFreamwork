package home;

import base.ReusableAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import reporting.TestLogger;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElementsLocatedBy;
import java.util.LinkedList;
import java.util.List;

public class HomePage_DragDrop extends ReusableAPI {

    //*******Find Elements**********

    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/div[1]/span")
    public static WebElement login;
    @FindBy(id = "_P002_Menu_WAR_P002_Menuportlet_btnAlternativeUrl")
    public static WebElement ok;

    //**********************    Declare Method    *********************************************

    public void serviceDragDrop() throws InterruptedException {
        login.click();
        WebDriverWait wait = new WebDriverWait(driver,10) ;
        //wait.until(visibilityOfAllElementsLocatedBy(By.className("selectedBox")));
        WebElement dropDown = driver.findElement(By.className("selectedText"));
        dropDown.click();
        Thread.sleep(2000);
        //wait.until(visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class='selectOptionsList']/li")));
        List<WebElement> dropDownList = driver.findElements(By.xpath("//ul[@class='selectOptionsList']/li"));
        List<String> listText= new LinkedList<String>();
        dropDownList.get(1).click();
        ok.click();
    }
}
