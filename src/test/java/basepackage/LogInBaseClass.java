package basepackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import pompackage.CartPagePOM;
import pompackage.InventoryPagePOM;
import pompackage.LogInPagePOM;
import pompackage.NavBarPOM;
import utilspackage.ActionsUtils;
import utilspackage.BrowserUtils;
import utilspackage.PropertyFileUtils;

public class LogInBaseClass {
    public  String user;
    public  String password;
    public  String browser;
    public  String url;

     PropertyFileUtils property;
     public BrowserUtils browserUtil;
     public ActionsUtils action;
     public LogInPagePOM login;
     public NavBarPOM navBar;
     public InventoryPagePOM inventory;
     public CartPagePOM cart;

    @BeforeSuite
    public void loadConfig() {
        property = new PropertyFileUtils();
        browserUtil = new BrowserUtils();
    }

    @BeforeTest
    public void loadData() {
        user = property.getConfigData("user");
        password = property.getConfigData("password");
        browser = property.getConfigData("browser");
        url = property.getConfigData("url");

    }

    @BeforeMethod()
    public void startBrowser() {
        browserUtil.openBrowser(browser);
        browserUtil.waitForPageLoad(10);
        browserUtil.openURL(url);
        browserUtil.maximizeBrowser();
        browserUtil.waitforElementLoad(10);
    }

    @BeforeMethod(dependsOnMethods = "startBrowser")
    public void loadAllPagess()
    {
        login =  new LogInPagePOM(browserUtil.getDriver());
        inventory = new InventoryPagePOM(browserUtil.getDriver());
        action =new ActionsUtils(browserUtil.getDriver());

    }


}