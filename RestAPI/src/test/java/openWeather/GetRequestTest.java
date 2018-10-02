package openWeather;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GetRequestTest {
    public static String url="";
    @Test
    public void testResponseCode(){
        int status=get(url).getStatusCode();
        Assert.assertEquals(status,200);
    }
    @Test
    public void testResponseTime(){
        long time=get(url).getTime();
        Assert.assertEquals(time> 0.0);
    }
    @Test
    public void testResponseCity(){
        Jso
    }

}
