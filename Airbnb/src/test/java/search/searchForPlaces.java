package search;

import FrontPage.SearchForPlaces;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class searchForPlaces extends SearchForPlaces { //inherited from main.java

    @Test
    public void inputPlaces (){
        //WebElement e = searchID;
        try{
            driver.findElement(By.xpath("//*[@id=\"Koan-via-Page0__input\"]")).sendKeys("Queens", Keys.ENTER);}
       catch(NoSuchElementException ex){
            driver.findElement(By.id("Koan-magic-carpet-koan-search-bar__input")).sendKeys("Queens", Keys.ENTER);
            }
    }
 /*@Test
    public void  click(){ // click on host
     driver.findElement(By.xpath("/html/body/div[5]/div/div/header/div/div/div[3]/div/div/nav/ul/li[2]/div/div/button/div/div")).click();
    }*/

}
