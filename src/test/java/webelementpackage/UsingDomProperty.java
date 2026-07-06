package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingDomProperty
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://practice.expandtesting.com/dynamic-loading/2");

          driver.findElement(By.xpath("//button[text()='Start']"))
                  .click();

          FluentWait<WebDriver> wait = new FluentWait(driver);
          wait.pollingEvery(Duration.ofSeconds(2));
          wait.withTimeout(Duration.ofSeconds(20));
          wait.ignoring(Exception.class);

         String domProp =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']")))
                  .getDomProperty("class");

          System.out.println(domProp);



      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
