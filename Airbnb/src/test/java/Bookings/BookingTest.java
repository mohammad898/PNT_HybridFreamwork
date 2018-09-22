package Bookings;

import Elements.FrontPage;
import FrontPage.Booking;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookingTest extends Booking {

    FrontPage frontPage;

    @BeforeMethod
    public void init(){
        frontPage = PageFactory.initElements(driver, FrontPage.class);
    }

    @Test
    public void bookingAHous(){
        inputPlaces();
        selectCheckingDate();
        selectChekoutDate();
        searchclick();
    }
}
