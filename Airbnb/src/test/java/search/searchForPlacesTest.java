package search;

import Elements.FrontPageElements;
import FrontPage.SearchForPlaces;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class searchForPlacesTest extends SearchForPlaces {

    FrontPageElements frontPageElements;

    @BeforeMethod
    public void init(){
        frontPageElements = PageFactory.initElements(driver, FrontPageElements.class);
    }

    @Test
    public void inputPlacesTest () {
        inputPlaces();
    }

}
