package FrontPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.breakdownMethodToSetUp;

public class SearchForPlaces extends breakdownMethodToSetUp {  //

    @FindBy(id = "Koan-magic-carpet-koan-search-bar__input")
    public static WebElement inputID;
    @FindBy(xpath = "//*[@id=\"Koan-via-Page0__input\"]")
    public static WebElement inputXpath;

    public void inputPlaces (){
        //WebElement e = searchID;
        try{
            driver.findElement(By.xpath("//*[@id=\"Koan-via-Page0__input\"]")).sendKeys("Queens", Keys.ENTER);}
        catch(NoSuchElementException ex){
            driver.findElement(By.id("Koan-magic-carpet-koan-search-bar__input")).sendKeys("Queens", Keys.ENTER);
        }
    }

}
