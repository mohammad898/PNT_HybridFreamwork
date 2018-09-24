package FrontPage;

import Elements.FrontPageElements;
import org.openqa.selenium.Keys;

public class Booking extends FrontPageElements {

    public void selectCheckingDate(){
        checkingDate.sendKeys("09/29/2018", Keys.ENTER);
    }
    public void selectChekoutDate(){
        checkoutDate.sendKeys("10/02/2018", Keys.ENTER);
    }
    public void searchclick(){
        searchClick.click();
    }
}
