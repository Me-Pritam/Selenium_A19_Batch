package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LogInInstaUsingCssSelector
{
    public static void main(String[] args)
    {
        try
        {
            System.setProperty("webdriver.edge.driver","./AllBrowserDrivers/msedgedriver.exe9");

            WebDriver driver = new EdgeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.instagram.com/");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("button._aswp._aswq._aswu._asw_._asx2"))
                            .click();

            driver.findElement(By.cssSelector("input[name='email']"))
                    .sendKeys("");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("input[name='pass']"))
                    .sendKeys("");

            Thread.sleep(1000);

            driver.findElement(By.cssSelector("div[aria-label='Log In']"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
