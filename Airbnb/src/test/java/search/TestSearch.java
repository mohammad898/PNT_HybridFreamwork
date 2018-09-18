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

public class TestSearch extends ReusableAPI{ //inherited from ReusableAPI

    @Test
    public void search (){
       driver.findElement(By.id("Koan-magic-carpet-koan-search-bar__input")).sendKeys("Queens", Keys.ENTER);
    }
}
