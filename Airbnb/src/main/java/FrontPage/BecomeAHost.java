package FrontPage;

import Elements.FrontPageElements;
import org.openqa.selenium.WebDriver;

public class BecomeAHost extends FrontPageElements {

    public BecomeAHost(WebDriver driver) {
        super(driver);
    }

    public void clickHost(){
        becomeAHost.click();
    }
    public void hostingHouse(){
        hostingAHome.click();
    }
}
