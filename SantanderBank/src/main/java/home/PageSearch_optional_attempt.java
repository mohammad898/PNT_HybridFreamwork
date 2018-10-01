package home;

import base.ReusableAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class PageSearch_optional_attempt extends ReusableAPI {

    public void searchpage() {
        driver.findElement(By.xpath("//*[@id='_P001_Header_WAR_P001_Headerportlet_search']")).sendKeys("credit card", Keys.ENTER);
    }

    public void searlogin() {
        driver.findElement(By.xpath("//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"_P002_Menu_WAR_P002_Menuportlet_entrada.alias\"]")).sendKeys("setu.usa01@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"_P002_Menu_WAR_P002_Menuportlet_loginButton\"]")).click();
    }

    public void classbody() {
        driver.findElement(By.xpath("//*[@id=\"_P049_Informations_Cluster_Grouper_WAR_P049_Informations_Clusterportlet_INSTANCE_znvkRoayqg9G__VIEW\"]/div/div/nav/ul/li[1]/a/span")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"_P049_Informations_Cluster_Grouper_WAR_P049_Informations_Clusterportlet_INSTANCE_znvkRoayqg9G__VIEW\"]/div/div/nav/ul/li[2]/a/span")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"_P049_Informations_Cluster_Grouper_WAR_P049_Informations_Clusterportlet_INSTANCE_znvkRoayqg9G__VIEW\"]/div/div/nav/ul/li[3]/a/span")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"_P001_Header_WAR_P001_Headerportlet__VIEW\"]/div/div/div[1]/p/a/img")).click();
    }

    public void TermsOfUse() {
        driver.findElement(By.xpath("//*[@id=\"_P016_Links_Cluster_Grouper_WAR_P016_Links_Cluster_Grouperportlet_INSTANCE_waGPiDzE81A5__VIEW\"]/div/footer/nav/div[1]/ul/li[2]/a/h4")).click();
    }

    public void PrivacyPolicy() {
        driver.findElement(By.xpath("//*[@id=\"_P016_Links_Cluster_Grouper_WAR_P016_Links_Cluster_Grouperportlet_INSTANCE_waGPiDzE81A5__VIEW\"]/div/footer/nav/div[1]/ul/li[3]/a/h4")).click();
    }

    public void ContactUs() {
        driver.findElement(By.xpath("//*[@id=\"_P016_Links_Cluster_Grouper_WAR_P016_Links_Cluster_Grouperportlet_INSTANCE_waGPiDzE81A5__VIEW\"]/div/footer/nav/div[1]/ul/li[4]/a")).click();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }

    public void SantanderUni() {
        driver.findElement(By.xpath("//*[@id=\"_P016_Links_Cluster_Grouper_WAR_P016_Links_Cluster_Grouperportlet_INSTANCE_waGPiDzE81A5__VIEW\"]/div/footer/nav/div[2]/div/ul/li[1]/div/ul/li[1]/a")).click();
    }

    public void GetStarted() {
        driver.findElement(By.xpath("//*[@id=\"_P016_Links_Cluster_Grouper_WAR_P016_Links_Cluster_Grouperportlet_INSTANCE_waGPiDzE81A5__VIEW\"]/div/footer/nav/div[2]/div/ul/li[1]/div/ul/li[2]/a")).click();
    }

    public void MortgageLending() {
        driver.findElement(By.xpath("//*[@id=\"_P016_Links_Cluster_Grouper_WAR_P016_Links_Cluster_Grouperportlet_INSTANCE_waGPiDzE81A5__VIEW\"]/div/footer/nav/div[2]/div/ul/li[1]/div/ul/li[3]/a")).click();
    }

    public void MortgageOrigination() {
        driver.findElement(By.xpath("//*[@id=\"_P016_Links_Cluster_Grouper_WAR_P016_Links_Cluster_Grouperportlet_INSTANCE_waGPiDzE81A5__VIEW\"]/div/footer/nav/div[2]/div/ul/li[1]/div/ul/li[4]/a")).click();
    }

    public void Business() {
        driver.findElement(By.xpath("//*[@id=\"navsup\"]/nav/ul/li[2]/a")).click();
    }

    public void ATMLocation() {
        driver.findElement(By.xpath("//*[@id=\"navsup\"]/nav/div/div/div[1]/a")).click();
    }

    public void FindATM() {
        driver.findElement(By.xpath("//*[@id=\"navsup\"]/nav/div/div/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"q\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("11230");
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div[1]/div/div/div/div/form/button")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div[1]/div/div/div/div/form/div/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("08879");
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/form/button")).click();
        driver.findElement(By.xpath("/html/body/header/div/a/img")).click();
    }

        public void hovermenu() {
            WebElement element = driver.findElement(By.xpath("//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[4]/a/span"));
            Actions actions = new Actions(driver);
            actions.moveToElement(element).perform();
            WebElement element1 = driver.findElement(By.xpath("//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[4]/div/div/ul/li/a"));
            Actions actions1 = new Actions(driver);
            actions1.moveToElement(element1).perform();
            driver.findElement(By.xpath("//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[4]/div/div/ul/li/ul/li[1]/a")).click();
    }

    }


