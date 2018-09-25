package Bookings;

import FrontPage.Booking;
import FrontPage.SearchForPlaces;
import base.ReusableAPI;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookingTest extends ReusableAPI {

    Booking booking;
    SearchForPlaces searchForPlaces;


    @BeforeMethod
    public void init(){
        booking = new Booking(driver);
        searchForPlaces = new SearchForPlaces(driver);

    }

    @Test
    public void bookingAHous() throws InterruptedException {
        searchForPlaces.inputPlaces();
        booking.selectCheckingDate();
        booking.selectChekoutDate();
        searchForPlaces.searchClick();
    }
}
