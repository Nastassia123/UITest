package pages;

import abstractPackage.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePageClass {


    private String url = "https://findlaw1.flsitebuilder-qa.com/wp-admin/";
    public final String email = "nastassia.chaliapina@thomsonreuters.com";
    public final String password = "7845366Nastya";
    private By emailInput = By.xpath("//input[@id='userid']");
    private By passwordInput = By.id("password");

    public LoginPage openLoginPage() {
        open(url);
        return this;
    }

    public WordPressAdminpage signIn(String email, String password) {
        WebElement emailfield = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(emailInput));
        emailfield.click();
        emailfield.sendKeys(email, Keys.ENTER);
        find(passwordInput).click();
        find(passwordInput).sendKeys(password, Keys.ENTER);
        return new WordPressAdminpage();
    }
}
