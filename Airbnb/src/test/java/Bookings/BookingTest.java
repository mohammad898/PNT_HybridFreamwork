package Bookings;

import Elements.FrontPageElements;
import FrontPage.Booking;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookingTest extends Booking {

    FrontPageElements frontPageElements;

    @BeforeMethod
    public void init(){
        frontPageElements = PageFactory.initElements(driver, FrontPageElements.class);
    }

    @Test
    public void bookingAHous(){
        inputPlaces();
        selectCheckingDate();
        selectChekoutDate();
        searchclick();
    }
}
