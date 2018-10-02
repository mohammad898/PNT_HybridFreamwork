package home;

import base.ReusableAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import java.util.ArrayList;
import java.util.List;

public class MongoDBElements extends ReusableAPI {

    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[1]/a/span")
    public static WebElement Banking;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[1]/div")
    public  WebElement bankingDiv;


   public void waitForBankingDiv()throws InterruptedException{
       Actions actions = new Actions(driver);
       actions.moveToElement(Banking).perform();
       Thread.sleep(2000);
   }

    public List<String> banking() throws InterruptedException {
        waitForBankingDiv();
        List<WebElement> bankingList = driver.findElements(By.xpath("//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[1]/div/div[1]/ul/li/a"));
        List<String> listText = new ArrayList<>();
        for (WebElement it: bankingList){
            listText.add(it.getText());
        }
        return listText;
    }
}
