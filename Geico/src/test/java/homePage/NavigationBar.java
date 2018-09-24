package homePage;

import base.BeforeNAfterMethods;
import base.CommonClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NavigationBar extends NavigationBarOptionMethod{

   @Test
    public void clickInsurance(){
       clickOnInsurance();
   }
    @Test
    public void clickInformation(){

       clickOnInformation();
    }
    @Test
    public void clickLocation() {
        clickOnLocationIcon();
    }
    @Test
    public void clickLogin(){

       clickLogin();
    }
    @Test
    public void clickSearchIcon(){

       clickOnSearchIcon();
    }
    @Test
    public void clickOnGeicoLogo(){

       clickOnGeicoLogo();
    }

}
