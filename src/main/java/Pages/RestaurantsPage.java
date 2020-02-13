package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RestaurantsPage extends PageBase {
    public RestaurantsPage(AndroidDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"ProfileScreen, tab, 3 of 3\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    WebElement myAccountButton ;
    public void openMyAccountPage(){
        waitForVisibilityOf(myAccountButton);
        myAccountButton.click();
    }
}
