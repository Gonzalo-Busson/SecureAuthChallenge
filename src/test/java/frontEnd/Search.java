package frontEnd;

import utils.DriverFactory;
import pages.LandingPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Search {
    WebDriver driver;

    @Before
    public void before(){
        driver = DriverFactory.open();
        String webURL = "https://www.ebay.com/";
        driver.get(webURL);

    }

    @Test
    public void searchAnItem(){
    LandingPage landingPage = new LandingPage(driver);
    landingPage.searchAnItem();
    landingPage.validateSuccessfulSearch();

    }

    @After
    public void after(){
        driver.quit();
    }
}
