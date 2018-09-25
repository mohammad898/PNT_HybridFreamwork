package FrontPage;

import Elements.FrontPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Booking extends FrontPageElements {

    public Booking(WebDriver driver) {
        super(driver);
    }

    public void selectCheckingDate() throws InterruptedException {
       try{
           checkinDate.sendKeys("09/29/2018");}
       catch (NoSuchElementException e){
        Thread.sleep(2000);
        dateButton.click();
       }
    }

    public void selectChekoutDate(){
        if (checkinDate != null){
        checkinDate.click();
        if (driver.findElements(By.tagName("<td")).contains("Choose")){
            Actions action = new Actions(driver);
            action.moveToElement(AcheckinDate).click().perform();
        } else
        checkoutDate.sendKeys("09/30/2018");
    }
        else{
            checkoutDate.sendKeys("09/30/2018");}
    }

    public void selectGuest(){
        guestButton.click();
        increaseGuest.click();
        applyButton.click();
    }
}
