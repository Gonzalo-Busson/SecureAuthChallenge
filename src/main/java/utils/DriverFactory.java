package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    public static WebDriver open() {
            System.setProperty("webdriver.chrome.driver","chromedriver 2");
            return new ChromeDriver();
    }
}
