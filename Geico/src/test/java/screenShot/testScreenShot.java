package screenShot;

import base.CommonClass;
import org.testng.annotations.Test;

public class testScreenShot extends CommonClass {
    String screenShot1 = "ScreenShot";
    @Test
    public void testCaptureScreenShot(){
        captureScreenshot(driver, screenShot1);
    }

}
