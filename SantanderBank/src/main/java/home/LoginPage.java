package home;

import base.CollectionApi;
import base.ReusableAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ReusableAPI {
    //find elements for login page
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/div[1]/div/div/p/button")
    public static WebElement Close;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/div[1]/span")
    public static WebElement LoginPage;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet_entrada.alias\"]")
    public static WebElement UserInput;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet_loginButton\"]")
    public static WebElement LoginButton;
    @FindBy(xpath = "//*[@id=\"entrada.pwd\"]")
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

    //Define methods for above elements
    public void InvalidUsernameInput() {
        LoginPage.click();
        UserInput.sendKeys("setu ");
        LoginButton.click();
    }

    public void ValidUserInput() {
        LoginPage.click();
        UserInput.sendKeys("setubank01");
        LoginButton.click();
        PasswordInput.sendKeys("astonmartin1");
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




}



