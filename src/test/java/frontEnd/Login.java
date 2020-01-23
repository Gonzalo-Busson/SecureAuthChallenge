package frontEnd;


import utils.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;

    @Before
    public void before(){
        driver = DriverFactory.open();
        String webURL = "https://www.ebay.com/";
        driver.get(webURL);

    }

//    @Test
//    public void login(){
//        LandingPage landingPage = new LandingPage(driver);
//        landingPage.clickLogin();
//        landingPage.fillUserCredentials();
//        landingPage.validateLogin();
//
//    }
    @After
    public void after(){
        driver.quit();
    }
}
