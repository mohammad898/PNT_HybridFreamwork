package FrontPage;

import Elements.FrontPageElements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

public class Booking extends FrontPageElements {

    public void selectCheckingDate() throws InterruptedException {
       try{
           checkinDate.sendKeys("09/29/2018");}
       catch (NoSuchElementException nOelement){
        Thread.sleep(2000);
        dateButton.click();

       }
    }
    public void selectChekoutDate(){
        if (checkinDate != null){
        checkoutDate.sendKeys("10/02/2018");}
    }
    public void searchclick(){
        searchClick.click();
    }
}
