package abstractPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LoginPage extends BasePageClass {


   private String url = "https://findlaw1.flsitebuilder-qa.com/wp-admin/";
    protected final String email = "nastassia_chaliapina@thomsonreuters.com";
    protected final String password = "7845366Nastya";
    private By emailInput = By.id("userid");
    private By passwordInput = By.id("password");

    public LoginPage openLoginPage(){
         open(url);
         return this;
    }

    public WordPressAdminpage signIn(String email, String password){
        find(emailInput).click();
        find(emailInput).sendKeys(email, Keys.ENTER);
        find(passwordInput).click();
        find(passwordInput).sendKeys(password, Keys.ENTER);
        find(By.className("btn.btn-primary.login-btn")).click();
        return new WordPressAdminpage();
    }
}
