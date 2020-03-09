package pages;

import abstractPackage.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewPageEditor extends BasePageClass {

    By pagesTitle = By.id("title");
    String pageName = "Test Page";
    By publish = By.id("publish");
    By viewElement = By.linkText("Preview page");

    public NewPageEditor createPageInTheEditor() {
        WebElement pageTitle = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(pagesTitle));
        pageTitle.sendKeys(pageName, Keys.ENTER);
        find(publish).click();
        WebElement pageLink = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(viewElement));
        pageLink.click();
        return this;
    }
}
