package home;

import ApiCollection.CollectionApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CorporateTextOptionPage extends CollectionApi {
    //find elements for Corporate Business hover option
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[3]/ul/li[1]/a/span")
    public static WebElement CorporateBusiness;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[3]/ul/li[1]/div/div/ul/li[1]/a")
    public static WebElement CommercialBanking;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[3]/ul/li[1]/div/div/ul/li[1]/ul/li[1]/a")
    public static WebElement CommercialBankingHome;
    //find element for Corporate Capabilities hover option
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[3]/ul/li[2]/a/span")
    public static WebElement CorporateCapabilities;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[3]/ul/li[2]/div/div/ul/li[1]/a")
    public static WebElement Lending;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[3]/ul/li[2]/div/div/ul/li[1]/ul/li[1]/a")
    public static WebElement LendingHome;
    // find elements for Stander Prespective hover option
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[3]/ul/li[3]/a/span")
    public static WebElement StanderPrespective;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[3]/ul/li[3]/div/div/ul/li/a")
    public static WebElement StanderPrespective2;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[3]/ul/li[3]/div/div/ul/li/ul/li[2]/a")
    public static WebElement IndustryAlert;

    //find methods for above elements
    public void CorporateBusiness(){
        Actions actions=new Actions(driver);
        actions.moveToElement(CorporateBusiness).perform();
        actions.moveToElement(CommercialBanking).perform();
        actions.moveToElement(CommercialBankingHome).click().perform();
    }
    public void CorporateCapabilities(){
        Actions actions=new Actions(driver);
        actions.moveToElement(CorporateCapabilities).perform();
        actions.moveToElement(Lending).perform();
        actions.moveToElement(LendingHome).click().perform();
    }
    public void StanderderPrespectives(){
        Actions actions=new Actions(driver);
        actions.moveToElement(StanderPrespective).perform();
        actions.moveToElement(StanderPrespective2).perform();
        actions.moveToElement(IndustryAlert).click().perform();
    }
}
