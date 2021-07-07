package Tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    protected static AndroidDriver driver;
    SoftAssert softAssert = new SoftAssert();
    @BeforeTest()
    public void setUp() throws MalformedURLException {
        // Created object of DesiredCapabilities class.
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Tohamy");
        cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", "com.w99l.customer.app");
        cap.setCapability("appActivity", "com.w99l.customer.app.MainActivity");
        cap.setCapability("autoGrantPermissions", true);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

    }
//    @AfterClass
//    public void tearDown() throws Exception {
//        driver.quit();
//    }

}
