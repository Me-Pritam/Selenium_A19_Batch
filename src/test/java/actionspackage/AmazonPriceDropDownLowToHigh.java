package actionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverInfo;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class AmazonPriceDropDownLowToHigh
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new EdgeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://www.amazon.in/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            Actions action = new Actions(driver);

            action.sendKeys(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")),"Vivo Mobiles")
                    .pause(Duration.ofSeconds(1))
                    .click(driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")))
                    .pause(Duration.ofSeconds(2))
                    .perform();

            action.click(driver.findElement(By.xpath("//select[@name='s']")))
                    .perform();

            action.click(driver.findElement(By.xpath("//li[.='Price: Low to High']")))
                    .perform();

//            action
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
