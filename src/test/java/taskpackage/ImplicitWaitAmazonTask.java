package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class ImplicitWaitAmazonTask
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.amazon.in/");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

          String parentId = driver.getWindowHandle();

          driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                  .sendKeys("Sony bluetooth headphones");

          driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"))
                  .click();

          driver.findElement(By.xpath("(//div[@data-cy='title-recipe']/child::a)[2]"))
                  .click();

          Set<String> allPageIds = driver.getWindowHandles();

          for(String pageId : allPageIds)
          {
              if (pageId.equals(parentId))
              {
                  continue;
              }
              else
              {
                driver.switchTo().window(pageId);
                break;
              }
          }

          driver.findElement(By.xpath("//input[@id='buy-now-button']"))
                  .click();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }

    }
}
