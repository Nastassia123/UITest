package abstractPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.util.concurrent.TimeUnit;

public class BasePageClass extends APIClass {
    static WebDriver driver;


    protected WebDriver getDriver() {
        return  driver;
    }


    public WebDriver initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
         return  new ChromeDriver();
    }


    public WebDriver setPropertyTimeOut() {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        return driver;
    }


    @BeforeClass
    public void setUp() {
        initializeDriver();
      }

    @AfterClass
    public void closeDown() {
       delay(2000);
       driver.quit();
    }
}
