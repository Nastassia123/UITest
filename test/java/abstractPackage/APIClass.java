package abstractPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class APIClass {



   private WebDriver getDriver(){
       System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
       return  new ChromeDriver();
   }


    public void open(String url) {
        getDriver().get(url);
    }

    public WebElement find(By locator){
        return  getDriver().findElement(locator);
    }


    public void delay(long millisec) {
        try {
            Thread.sleep(millisec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
