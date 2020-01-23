package frontEnd;

import utils.DriverFactory;
import pages.LandingPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Notifications {
    WebDriver driver;

    @Before
    public void before(){
        driver = DriverFactory.open();
        String webURL = "https://www.ebay.com/";
        driver.get(webURL);

    }
    @Test
    public void ValidateNotificationsIsDisplayed(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.hoverLocationElement();
    }

    @After
    public void after(){
        driver.quit();
    }
}
