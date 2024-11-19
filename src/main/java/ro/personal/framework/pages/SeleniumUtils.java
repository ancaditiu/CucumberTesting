package ro.personal.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtils {

//    public WebDriver driver = Hooks.getDriver();
    public static WebDriver driver = new ChromeDriver();

    public void goTo(String URL){
        driver.get(URL);
    }

    public void terminate(){
        driver.quit();
    }

    public void close(){
        driver.close();
    }

    public void waitForClickablePageElement(int seconds, By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.elementToBeClickable((by)));
    }

}