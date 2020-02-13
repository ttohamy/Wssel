package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

    @FindBy(id ="com.android.packageinstaller:id/permission_allow_button" )
    WebElement permissionButton ;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView")
    WebElement nextButton;



    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    public void allowPermission(){
        waitForVisibilityOf(permissionButton);
        permissionButton.click();
    }
    public void clickNext(){
        waitForVisibilityOf(nextButton);
        nextButton.click();
    }


}
