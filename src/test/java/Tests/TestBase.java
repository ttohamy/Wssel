package Tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    protected AndroidDriver driver;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Created object of DesiredCapabilities class.
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Tohamy");
        cap.setCapability("platformName", "Android");
        cap.setCapability("udid","X003573");
        cap.setCapability("appPackage", "com.w99l.customer.app");
        cap.setCapability("appActivity", "com.w99l.customer.app.MainActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }
//    @AfterClass
//    public void tearDown() throws Exception {
//        driver.quit();
//    }



}
