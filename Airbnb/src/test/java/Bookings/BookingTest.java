package Bookings;

import Elements.FrontPage;
import FrontPage.Booking;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BookingTest extends Booking {

    FrontPage frontPage;

    @Test
    public void bookingAHous(){
        frontPage = PageFactory.initElements(driver, FrontPage.class);
        selectCheckingDate();
        selectChekoutDate();
        searchclick();
    }
}
