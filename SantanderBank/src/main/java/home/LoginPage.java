package home;


import base.ReusableAPI;
import base.XlsDataReaderUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.Iterator;

public class LoginPage extends ReusableAPI {

    //**************   Find elements for login page   ***************

    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/div[1]/div/div/p/button")
    public static WebElement Close;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/div[1]/span")
    public static WebElement LoginPage;
    @FindBy(xpath = "//input[@id='_P002_Menu_WAR_P002_Menuportlet_entrada.alias']")
    public static WebElement UserInput;
    @FindBy(xpath = "//button[@id='_P002_Menu_WAR_P002_Menuportlet_loginButtonTM']")
    public static WebElement LoginButton;
    @FindBy(xpath = "//input[@id='_P002_Menu_WAR_P002_Menuportlet_entrada.pwd']")
    public static WebElement PasswordInput;
    @FindBy(xpath = "//*[@id=\"btnSubmit\"]/span")
    public static WebElement LoginButton2;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet_formLogin\"]/fieldset/div/span/div[4]/p[1]/a")
    public static WebElement FirstTimeUser;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet_formLogin\"]/fieldset/div/span/div[4]/p[2]/a")
    public static WebElement ForgetId;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet_formLogin\"]/fieldset/div/span/div[4]/p[3]/a")
    public static WebElement ForgetPassword;
    @FindBy(xpath = "//*[@id=\"main_btnCancel_enlace\"]/span")
    public static WebElement Cancel;
    @FindBy(xpath = "//*[@id=\"yes\"]")
    public static WebElement Yes;
    //online Service Drop Down elements
    @FindBy(xpath = "//*[@id=\"formSelect\"]/fieldset/div/div[1]")
    public static WebElement InputBox;
    @FindBy(xpath = "//*[@id=\"formSelect\"]/fieldset/div/div[1]/div/div/div")
    public static WebElement selectbox;
    @FindBy(id = "_P002_Menu_WAR_P002_Menuportlet_btnAlternativeUrl")
    public static WebElement ok;
    @FindBy(xpath = "//input[@id='_P002_Menu_WAR_P002_Menuportlet_entrada.pwd']")
    public static WebElement PassWordInput;
    @FindBy(xpath = "//span[contains(text(),'Login')]")
    public static WebElement login1;

    //**************  Read XL file by Data Provider   **********************
   @DataProvider
   public Iterator<Object[]> supplyData(){
       ArrayList<Object[]> testData = XlsDataReaderUtil.getDataFromExcel();
       return testData.iterator();
   }
    //****************   Define methods for above elements   ***********************
    public void InvalidUsernameInput(String email) {
        LoginPage.click();
        UserInput.sendKeys(email);
        LoginButton.click();
    }
    public void ValidUserInput(String email,String passCode) {
        LoginPage.click();
        UserInput.sendKeys(email);
        LoginButton.click();
        PasswordInput.sendKeys(passCode);
        LoginButton2.click();
    }
    public void Enrollnow() {
        LoginPage.click();
        FirstTimeUser.click();
    }
    public void ForgetId() {
        LoginPage.click();
        ForgetId.click();
        Cancel.click();
        Yes.click();
    }
    //**************** Purpose For keyword login *********************
    public void checkLoginFuction(){
       UserInput.sendKeys("nasirvi@yahoo.com");
       PassWordInput.sendKeys("1234");
       LoginButton.click();

    }
}



