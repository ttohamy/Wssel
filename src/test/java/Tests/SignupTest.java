package Tests;


import Pages.*;
import org.testng.annotations.Test;

public class SignupTest extends TestBase {
    HomePage homePage ;
    LocationPage locationPage;
    SignInPage signInPage ;
    SignUpPage signUpPage;
    RestaurantsPage restaurantsPage;
    MyAccountPage myAccountPage;
    @Test
    public void userCanSignUp(){
        homePage = new HomePage(driver);
        locationPage = new LocationPage(driver);
        signInPage = new SignInPage(driver);
        signUpPage = new SignUpPage(driver);
        restaurantsPage = new RestaurantsPage(driver);
        myAccountPage = new MyAccountPage(driver);
        homePage.allowPermission();
        homePage.clickNext();
        homePage.clickNext();
        homePage.clickNext();
        homePage.clickNext();
        locationPage.fillLocation();
        restaurantsPage.openMyAccountPage();
        myAccountPage.openSignInPage();
        signInPage.openSignUpPage();
        signUpPage.signUp("Mohamed","ElTohamy","12345678");


    }
}
