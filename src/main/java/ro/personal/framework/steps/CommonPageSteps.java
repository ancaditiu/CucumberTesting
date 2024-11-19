package ro.personal.framework.steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import ro.personal.framework.pages.CommonPage;
import ro.personal.framework.pages.SeleniumUtils;


public class CommonPageSteps extends SeleniumUtils {

    CommonPage commonPage = new CommonPage();

    @Given("Go to page")
    public void goToPage(){
        goTo("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @And("User is on {string} page")
    public void userIsOnDesiredPage(String pageName){
        commonPage.userIsOnDesiredPage(pageName);
    }

    @And("User logs out")
    public void userLogsOut(){
        commonPage.clickBurgerMenu();
        commonPage.clickLogout();
    }

    @And("Quit the browser")
    public void terminateSession(){
        terminate();
    }

    @And("Close the browser window")
    public void closeWindow(){
        close();
    }

}