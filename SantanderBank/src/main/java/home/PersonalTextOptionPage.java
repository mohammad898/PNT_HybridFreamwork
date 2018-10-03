package home;

<<<<<<< HEAD
=======
//import base.CollectionApi;
>>>>>>> fb6f6704fb1307df989b4453104f7e4a3b43b432
import base.ReusableAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PersonalTextOptionPage extends ReusableAPI {

    // define elements for Banking hover option
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[1]/a/span")
    public static WebElement Banking;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[1]/div/div/ul/li[1]/a")
    public static WebElement Checking;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[1]/div/div/ul/li[1]/ul/li[1]/a")
    public static WebElement CheckingHome;
    //define elements for Borrowing hover option
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[2]/a/span")
    public static WebElement Borrowing;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[2]/div/div/ul/li[1]/a")
    public static WebElement LinesOfCredit;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[2]/div/div/ul/li[1]/ul/li[1]/a")
    public static WebElement LinesOfCreditHome;
    //define elements for Investments and Protections
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[3]/a/span")
    public static WebElement InvestmentandProtections;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[3]/div/div/ul/li/a")
    public static WebElement InvestServiceOffer;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[3]/div/div/ul/li/ul/li[1]/a")
    public static WebElement InvestServiceOfferHome;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[4]/a/span")
    //define elements for Credit Card
    public static WebElement CreditCard;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[4]/div/div/ul/li/a")
    public static WebElement CreditCard2;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[4]/div/div/ul/li/ul/li[1]")
    public static WebElement CreditCardHome;
    //define elements for Prosper and Thrive
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[5]/a/span")
    public static WebElement ProsperandThrives;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[5]/div/div/ul/li")
    public static WebElement ProsperandThrives2;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[5]/div/div/ul/li/ul/li[1]/a")
    public static WebElement ProsperandThrivesHome;


    //define function for above element
    public void Banking(){
        Actions actions = new Actions(driver);
        actions.moveToElement(Banking).perform();
        actions.moveToElement(Checking).perform();
        actions.moveToElement(CheckingHome).click().perform();
    }
    public void Borrowing(){
        Actions actions=new Actions(driver);
        actions.moveToElement(Borrowing).perform();
        actions.moveToElement(LinesOfCredit).perform();
        actions.moveToElement(LinesOfCreditHome).click().perform();
    }
    public void InvestmentandProtections(){
        Actions actions=new Actions(driver);
        actions.moveToElement(InvestmentandProtections).perform();
        actions.moveToElement(InvestServiceOffer).perform();
        actions.moveToElement(InvestServiceOfferHome).click().perform();
    }
    public void CreditCard(){
        Actions actions=new Actions(driver);
        actions.moveToElement(CreditCard).perform();
        actions.moveToElement(CreditCard2).perform();
        actions.moveToElement(CreditCardHome).click().perform();
    }
    public void ProsperandThrive(){
        Actions actions=new Actions(driver);
        actions.moveToElement(ProsperandThrives).perform();
        actions.moveToElement(ProsperandThrives2).perform();
        actions.moveToElement(ProsperandThrivesHome).click().perform();
    }
}
