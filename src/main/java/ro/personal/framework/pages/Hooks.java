//package ro.personal.framework.pages;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import org.openqa.selenium.WebDriver;
//
//public class Hooks {
//
//    private static WebDriver driver;
//
//    @Before
//    public void setUp(){
//        String browser = System.getProperty("browser", "chrome");
//        driver = DriverFactory.getDriiver(browser);
//    }
//
//    @After
//    public void tearDown(){
//        DriverFactory.quitDriver();
//    }
//
//    public static WebDriver getDriver(){
//        return driver;
//    }
//
//}
