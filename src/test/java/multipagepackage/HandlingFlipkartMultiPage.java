package multipagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandlingFlipkartMultiPage
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.flipkart.com/");

          Thread.sleep(2000);

          String parentId = driver.getWindowHandle();

          driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"))
                  .sendKeys("Titan Watches");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//span[text()='✕']")).click();

          Thread.sleep(2000);

          driver.findElement(By.xpath("//button[contains(@aria-label,'Search for Products, Brands and More')]"))
                  .click();

          Thread.sleep(2000);

          driver.findElement(By.xpath("(//div[@class='nZIRY7 yBaAQY'])[1]/child::div[4]"))
                  .click();

          Thread.sleep(2000);

          Set<String> allPageIds = driver.getWindowHandles();

          for(String pageId : allPageIds)
          {
              if (pageId.equals(parentId))
              {
                  continue;
              }
              else {
                  driver.switchTo().window(pageId);
                  break;
              }
          }

          driver.findElement(By.xpath("//div[contains(.,'Buy at') " +
                          "and @class=\"_1psv1zeb9 _1psv1ze0\"]/descendant::*[name()='svg']"))
                  .click();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
