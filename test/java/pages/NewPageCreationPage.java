package pages;

import abstractPackage.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class NewPageCreationPage extends BasePageClass {

    By addNewPageLocator = By.linkText("Add New");

    public NewPageEditor openPageEditor() {
        WebElement pageEditorWindow = new WebDriverWait(driver, 20)
                .until(ExpectedConditions.presenceOfElementLocated(addNewPageLocator));
        pageEditorWindow.click();
        return new NewPageEditor();

    }
}
