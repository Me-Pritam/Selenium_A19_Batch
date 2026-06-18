package synchronizationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingExplicitWaitZepto
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.zepto.com/");

          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='Search for products']")))
                  .click();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
