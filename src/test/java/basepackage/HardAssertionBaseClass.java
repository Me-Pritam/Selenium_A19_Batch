package basepackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import pompackage.*;
import utilspackage.ActionsUtils;
import utilspackage.BrowserUtils;
import utilspackage.PropertyFileUtils;

public class HardAssertionBaseClass
{
    public  String user;
    public  String password;
    public  String browser;
    public  String url;

    public PropertyFileUtils property;
    public BrowserUtils browserUtil;
    public ActionsUtils action;
    public LogInPagePOM login;
    public NavBarPOM navBar;
    public InventoryPagePOM inventory;
    public CartPagePOM cart;
    public ProductPagePOM product;
    public CheckOutStepOnePOM checkOutOne;
    public CheckOutStepTwoPOM checkOutTwo;

    public WebDriver driver;

    @BeforeSuite
    public void loadObject()
    {
        property = new PropertyFileUtils();
        browserUtil = new BrowserUtils();
    }

    @BeforeTest
    public void loadConfig()
    {
        user = property.getConfigData("user");
        password = property.getConfigData("password");
        browser = property.getConfigData("browser");
        url = property.getConfigData("url");
    }

    @BeforeClass
    public void doConfiguration()
    {
        browserUtil.openBrowser(browser);
        browserUtil.waitForPageLoad(10);
        browserUtil.openURL(url);
        browserUtil.waitforElementLoad(10);
        browserUtil.maximizeBrowser();

        driver = browserUtil.getDriver();
    }

    @BeforeClass
    public void loadAllPOMPages()
    {
        login = new LogInPagePOM(driver);
        inventory = new InventoryPagePOM(driver);
        navBar = new NavBarPOM(driver);
        product = new ProductPagePOM(driver);
        checkOutOne = new CheckOutStepOnePOM(driver);
        checkOutTwo = new CheckOutStepTwoPOM(driver);
        cart = new CartPagePOM(driver);

        action = new ActionsUtils(driver);
    }
}
