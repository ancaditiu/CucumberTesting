//package ro.personal.framework.pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;
//
//public class DriverFactory {
//
//        private static WebDriver driver;
//
//        public static WebDriver getDriiver(String browser){
//            switch (browser.toLowerCase()) {
//                case "chrome":
//                    driver = new ChromeDriver();
//                    break;
//                case "firefox":
//                    driver = new FirefoxDriver();
//                    break;
//                case "edge":
//                    driver = new EdgeDriver();
//                    break;
//                case "safari":
//                    driver = new SafariDriver();
//                    break;
//                default:
//                    throw new IllegalArgumentException("Invalid browser name");
//            }
//            driver.manage().window().maximize();
//            return driver;
//        }
//
//        public static void quitDriver(){
//            if( driver != null){
//                driver.quit();
//                driver = null;
//            }
//        }
//
//
//}
