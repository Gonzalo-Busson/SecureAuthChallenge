package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helpers;

import java.util.concurrent.TimeUnit;

public class LandingPage {
    WebDriver driver;
    private final String name = "Secure";
    private final String lastName = "Auth";
    private final String email = "SecureAuth@gmail.com";
    private final String password = "Secure1234";
    private final String item = "Iphone";

    @FindBy(xpath = "//*[@id=\"gh-ug\"]/a")
    WebElement loginButtonLandingPage;

    @FindBy(id = "userid")
    WebElement userNameField;

    @FindBy(id = "pass")
    WebElement userPasswordField;

    @FindBy (id = "sgnBt")
    WebElement loginButtonLoginPage;

    @FindBy (id = "gh-Alerts-i")
    WebElement notificationsIcon;

    @FindBy (id = "gh-eb-Alerts-o")
    WebElement notificationsPlaceHolder;

    @FindBy (id = "items_list1")
    WebElement offersCarouselComponent;

    @FindBy (id = "gh-ac")
    WebElement searchBar;

    @FindBy(id="gh-btn")
    WebElement searchButton;

    @FindBy(id="srp-river-results")
    WebElement SearchResults;

    @FindBy(css="#srp-river-results-listing1 > div > div.s-item__info.clearfix > a > h3")
    WebElement firstItemCardTittle;

    Helpers helpers = new Helpers();





    public void clickLogin(){
            loginButtonLandingPage.click();
    }

    public void validateLogin(){
       WebElement element =  driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/b[1]"));
        try {
            element.getText().equals(name);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void inputUserName(){
        userNameField.sendKeys(email);
    }

    private void inputPassword(){
        userPasswordField.sendKeys(password);
    }

    private void clickLoginButton(){
        loginButtonLoginPage.click();
    }

    public void fillUserCredentials(){
        inputUserName();
        inputPassword();
        clickLoginButton();
    }

    public void validateOffersCarousel (){
        try {
            helpers.scrollToElement(offersCarouselComponent, driver);
        } catch (Exception e){
            System.out.println("OffersCarouselComponent wasn't displayed ");
            e.printStackTrace();
        }
    }

    public void hoverLocationElement(){
        if(helpers.isElementPresent(notificationsIcon)){
            Actions action = new Actions(driver);
            action.moveToElement(notificationsIcon).moveToElement(notificationsPlaceHolder);
        }
    }

    public void inputSearchBar(){
        searchBar.clear();
        searchBar.sendKeys(item);
    }
    public void clickSearchButton(){
        searchButton.click();
    }

    public void searchAnItem(){
        inputSearchBar();
        clickSearchButton();
    }
    public void validateSuccessfulSearch(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        if(helpers.isElementPresent(SearchResults)){
            firstItemCardTittle.isDisplayed();
        }


    }
    public LandingPage (WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
}
