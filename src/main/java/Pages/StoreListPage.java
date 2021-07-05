package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StoreListPage extends PageBase {
    public StoreListPage(AndroidDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"ProfileScreen, tab, 3 of 3\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    WebElement myAccountButton ;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
    WebElement storeListItem ;

    public void openMyAccountPage(){
        waitForVisibilityOf(myAccountButton);
        myAccountButton.click();
    }
    public boolean isStoreListItemsAppears(){
        waitForVisibilityOf(storeListItem);
        if(storeListItem.isDisplayed()){
            System.out.println("Store list appears successfully!!");
            return true;
        }else {
            return false;
        }

    }
}
