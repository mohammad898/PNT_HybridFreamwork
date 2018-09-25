package home;

<<<<<<< HEAD
import base.CollectionApi;
=======
import base.ReusableAPI;
>>>>>>> 9a08152c9d10b2db27537fbdb6b834ef6e515e1a
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AboutTextOptionPage extends ReusableAPI {
    //find elements for Who We Are hover option
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[4]/ul/li[1]/a/span")
    public static WebElement WhoWeAre;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[4]/ul/li[1]/div/div/ul/li/a")
    public static WebElement SantanderBank;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[4]/ul/li[1]/div/div/ul/li/a")
    public static WebElement Cummunity;
    // find elements for Santander Universities hover option
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[4]/ul/li[2]/a/span")
    public static WebElement SantanderBankUni;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[4]/ul/li[2]/div/div/ul/li/a")
    public static WebElement ProgramOverView;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[4]/ul/li[2]/div/div/ul/li/ul/li[3]/a")
    public static WebElement UniversityTestimonial;
    //define methods for above elements
    public void WhoWeAre(){
        Actions actions=new Actions(driver);
        actions.moveToElement(WhoWeAre).perform();
        actions.moveToElement(SantanderBank).perform();
        actions.moveToElement(Cummunity).click().perform();
    }
    public void SantanderBankUni(){
        Actions actions=new Actions(driver);
        actions.moveToElement(SantanderBankUni).perform();
        actions.moveToElement(ProgramOverView).perform();
        actions.moveToElement(UniversityTestimonial).click().perform();
    }
}
