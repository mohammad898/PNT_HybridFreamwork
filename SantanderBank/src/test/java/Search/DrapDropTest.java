package Search;

import home.DragDrop;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DrapDropTest extends DragDrop {
    @BeforeMethod
    public void init(){
        DragDrop dragDrop= PageFactory.initElements(driver,DragDrop.class);
        driver.get("https://santandercards-web.oflows.net/oflows/web/prodstart.seam?page=eligibility&prod=bravo_662&product_code=500&product_sub_code=662&_ga=2.59854061.1301098346.1537680007-390236672.1537680007");
    }
    @Test
    public void dragdrop(){drag();}
}
