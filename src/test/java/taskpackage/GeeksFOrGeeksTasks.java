package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class GeeksFOrGeeksTasks
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
  
          driver.get("https://www.geeksforgeeks.org/");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

          Actions actions = new Actions(driver);

          actions.moveToElement(driver.findElement(By.xpath("//li[@class='headerMainListItem']/descendant::div[text()='Courses']")))
                  .perform();

          actions.click(driver.findElement(By.xpath("//li[@class='megaDropDownListItem']/a[text()='DSA / Placements']")))
                  .perform();

          actions.sendKeys(driver.findElement(By.xpath("//input[@placeholder='What do you want to learn today?']")),"Java")
                  .perform();

      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
