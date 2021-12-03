package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtil {
    private DriverUtil(){}



    private static WebDriver driver;


    public static WebDriver getDriver(){
        String browser=PropertiesReadingUtil.getProperties("browser");
        if (driver == null){

            switch(browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case"edge":
                    WebDriverManager.edgedriver().setup();
            }
        }
        return driver;
    }
    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
