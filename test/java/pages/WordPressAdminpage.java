package pages;

import abstractPackage.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WordPressAdminpage extends BasePageClass {

    By pageMenuItem = By.xpath("//li[@id='menu-pages']");

    public NewPageCreationPage chooseActionToCreateANewPage() {
        WebElement pageField = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(pageMenuItem));
        pageField.click();
        return new NewPageCreationPage();
    }
}
