package search;

import base.ReusableAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSearch extends breakdownMethod4search{ //inherited from ReusableAPI

  /*  @Test
    public void search (){
       driver.findElement(By.id("Koan-magic-carpet-koan-search-bar__input")).sendKeys("Queens", Keys.ENTER);
    }*/
 @Test
    public void  click(){
        driver.findElement(By.xpath("/html/body/div[5]/div/div/header/div/div/div[3]/div/div/nav/ul/li[2]/div/div/button/div/div")).click();
    }

}
