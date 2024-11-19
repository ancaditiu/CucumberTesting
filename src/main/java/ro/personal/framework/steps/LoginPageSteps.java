package ro.personal.framework.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ro.personal.framework.pages.LoginPage;


public class LoginPageSteps extends LoginPage {

    @When("User enters {string} credentials")
    public void enterUserCredentials(String user){
        enterUserName(user);
        enterPassword();
        clickLogin();
    }

    @Then("User is logged in")
    public void loggedIn(){
        Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
    }

    @Then("User sees an error")
    public void userSeesError(){
        WebElement error = driver.findElement(By.className("error-message-container"));
        Assert.assertEquals("Epic sadface: Sorry, this user has been locked out.", error.getText());
    }

}
