package basepackage;

import org.testng.Reporter;
import org.testng.annotations.*;

public class DummyBaseClass
{
    @BeforeSuite
    public void beforeSuite()
    {
        Reporter.log("This is a Before Suite",true);
    }

    @BeforeTest
    public void beforeTest()
    {
        Reporter.log("This is a Before Test",true);
    }

    @BeforeMethod
    public void beforeMethod()
    {
        Reporter.log("This is a Before Method",true);
    }

    @BeforeClass
    public void beforeClass()
    {
        Reporter.log("This is a Before Class",true);
    }

    @AfterMethod
    public void afterMethod()
    {
        Reporter.log("This is a After Method",true);
    }

    @AfterClass
    public void afterClass()
    {
        Reporter.log("This is a After Class",true);
    }

    @AfterTest
    public void afterTest()
    {
        Reporter.log("This is a After Test ",true);
    }

    @AfterSuite
    public void afterSuite()
    {
        Reporter.log("This is a After Suite",true);
    }
}
