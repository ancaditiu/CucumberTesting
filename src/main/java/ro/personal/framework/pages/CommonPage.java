package ro.personal.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommonPage extends SeleniumUtils {

    public void clickBurgerMenu() {
        WebElement burgerMenu = driver.findElement(By.id("react-burger-menu-btn"));
        burgerMenu.click();
    }

    public void clickLogout(){
        WebElement logOutBtn = driver.findElement(By.id("logout_sidebar_link"));
        waitForClickablePageElement(1, By.id("logout_sidebar_link"));
        logOutBtn.click();
    }

    public void userIsOnDesiredPage(String pageName){
        switch (pageName) {
            case "login": Assert.assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());
                break;
        }
    }

}
