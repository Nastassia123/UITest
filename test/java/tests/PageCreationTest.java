package tests;

import org.testng.Assert;
import pages.LoginPage;
import org.testng.annotations.Test;
import pages.NewPageEditor;

public class PageCreationTest extends LoginPage {


    @Test
    public void testPageCreation()  {
        NewPageEditor wordPressAdminpage = new LoginPage()
                .openLoginPage()
                .signIn(email, password)
                .chooseActionToCreateANewPage()
                .openPageEditor()
                .createPageInTheEditor();
        Assert.assertNotEquals(wordPressAdminpage, null);
    }
}
