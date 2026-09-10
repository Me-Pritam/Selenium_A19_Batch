package testpackage;

import basepackage.HardAssertionBaseClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class EToEUsingHardAssertion extends HardAssertionBaseClass
{
    @Test
    public void doLogIn()
    {

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/","LogInPage isn not displayed");
        Reporter.log("The LogInPageb is displayed",true);

        action.writeInInputField(login.getUserNameField(),user);

        action.writeInInputField(login.getPasswordField(),password);

        action.clickOnElement(login.getLogInButton());

    }

    @Test(dependsOnMethods = "doLogIn")
    public void selectItem()
    {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html","Inventory Page is not opended");
        Reporter.log("The Inventory is opened",true);

        inventory.selectDesiredProductByName("Sauce Labs Backpack");
        Reporter.log("The Desired Item is clicked",true);
    }

    @Test(dependsOnMethods = "selectItem")
    public void addProductToCart()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory-item.html?id"),"The Desired Product Page is not opedned");
        Reporter.log("The Desired Product page is opened",true);

        action.clickOnElement(product.getAddToCartButton());

        action.clickOnElement(navBar.getCartIcon());
    }

    @Test(dependsOnMethods = "addProductToCart")
    public void goToCart()
    {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/cart.html","The Cart Page is not opened");
        Reporter.log("The Cart Page is oopened",true);
    }
}
