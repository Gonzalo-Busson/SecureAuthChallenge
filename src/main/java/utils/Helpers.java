package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class Helpers {

    public boolean isElementPresent(WebElement element) {
        try {
            element.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void scrollToElement(WebElement element, WebDriver driver){
        if(isElementPresent(element)){
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            Actions actions = new Actions(driver);
            actions.moveToElement(element);
            actions.perform();
        }
    }

}
