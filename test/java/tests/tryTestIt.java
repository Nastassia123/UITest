package tests;

import abstractPackage.LoginPage;
import abstractPackage.WordPressAdminpage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class tryTestIt extends LoginPage {


    @Test
    public void testLogin() {
  WordPressAdminpage wordPressAdminpage =  new LoginPage().openLoginPage().signIn(email, password);

    }
}
