package Tests;

import Pages.MyAccountPage;
import Pages.ProfilePage;
import Pages.SignInPage;
import Pages.StoreListPage;
import org.testng.annotations.Test;

public class SignInTest extends TestBase {
    StoreListPage storeListPage ;
    ProfilePage profilePage ;
    SignInPage signInPage ;
    MyAccountPage myAccountPage ;
    @Test(priority = 2)
    public void userCanSignInSuccessfully(){
        storeListPage = new StoreListPage(driver);
        profilePage = new ProfilePage(driver);
        signInPage = new SignInPage(driver);
        myAccountPage = new MyAccountPage(driver);
        storeListPage.openMyAccountPage();
        profilePage.openSignInPage();
        signInPage.addPhoneAndPassword("0593657680","12345678");
        softAssert.assertTrue(myAccountPage.isLogOutButtonAppears());
    }
}
