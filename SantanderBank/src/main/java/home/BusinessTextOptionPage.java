package home;

import base.CollectionApi;
import base.ReusableAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BusinessTextOptionPage extends ReusableAPI {
    //find elements for Banking hover option
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[2]/ul/li[1]/a/span")
    public static WebElement Banking;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[2]/ul/li[1]/div/div/ul/li[3]")
    public static WebElement PaymentsandProcess;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[2]/ul/li[1]/div/div/ul/li[3]/ul/li[1]/a")
    public static WebElement PaymentsandProcessHome;
    //find elements for Borrowing hover option
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[2]/ul/li[2]/a/span")
    public static WebElement Borrowing;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[2]/ul/li[2]/div/div/ul/li/a")
    public static WebElement BorrowingOption;
    @FindBy (xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[2]/ul/li[2]/div/div/ul/li/ul/li[1]/a")
    public static WebElement BorrowingOptionHome;
    //find element for Business FIrst hover option
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[2]/ul/li[3]/a/span")
    public static WebElement BusinessFirst;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[2]/ul/li[3]/div/div/ul/li/a")
    public static WebElement BusinessFirst2;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[2]/ul/li[3]/div/div/ul/li/ul/li[1]/a")
    public static WebElement BusinessFirstHome;

    //define methods for above element
    public void Banking(){
        Actions actions=new Actions(driver);
        actions.moveToElement(Banking).perform();
        actions.moveToElement(PaymentsandProcess).perform();
        actions.moveToElement(PaymentsandProcessHome).click().perform();
    }
    public void Borrowing(){
        Actions actions=new Actions(driver);
        actions.moveToElement(Borrowing).perform();
        actions.moveToElement(BorrowingOption).perform();
        actions.moveToElement(BorrowingOptionHome).click().perform();
    }
    public void BusinessFirst(){
        Actions actions=new Actions(driver);
        actions.moveToElement(BusinessFirst).perform();
        actions.moveToElement(BusinessFirst2).perform();
        actions.moveToElement(BusinessFirstHome).click().perform();
    }

}
