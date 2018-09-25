package FrontPage;

import Elements.FrontPageElements;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

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
        checkinDate.sendKeys("09/29/2018");
        checkoutDate.sendKeys("10/02/2018");
    }
        else{
            checkoutDate.sendKeys("10/02/2018");}
    }

    public void selectGuest(){}
}
