package ro.personal.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends SeleniumUtils {

    public void enterUserName(String userName) {
        WebElement user = driver.findElement(By.id("user-name"));
        user.sendKeys(userName);
    }

    public void enterPassword() {
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
    }

    public void clickLogin() {
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }



}
