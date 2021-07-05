package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChooseLangPage extends PageBase {
    public ChooseLangPage(AndroidDriver driver){super(driver);}
    @FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup")
    WebElement selectEnglish ;
    @FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]")
    WebElement confirmButton ;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    WebElement skipButton ;
    public void chooseLang(){
        waitForElementToBeClickable(selectEnglish);
        selectEnglish.click();
        waitForElementToBeClickable(confirmButton);
        try {
            Thread.sleep(4000);
            confirmButton.click();
            Thread.sleep(4000);
        }catch (Exception e){
            System.out.println("Shit");
        }

    }
    public void clickSkip(){
        waitForElementToBeClickable(skipButton);
        skipButton.click();
    }


}
