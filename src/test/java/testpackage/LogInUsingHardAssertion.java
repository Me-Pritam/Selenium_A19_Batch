package testpackage;

import basepackage.LogInBaseClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LogInUsingHardAssertion extends LogInBaseClass
{

    @Test
    public void performLogIn()
    {
        Assert.assertEquals(browserUtil.getUrl(),"https://www.saucedemo.com/","The Expected LogIn Page URL is not opened");
        Reporter.log("The Expected LogIn Page URL is opened",true);

        action.writeInInputField(login.getUserNameField(),user);

        action.writeInInputField(login.getPasswordField(),password);

        action.clickOnElement(login.getLogInButton());

        Assert.assertEquals(browserUtil.getUrl(),"https://www.saucedemo.com/inventory.html","The Inventory Page is not opended");
        Reporter.log("The Inventory Page is successfully opened",true);

    }
}
