package actionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class PerformingDoubleClick_ContextClick
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

          driver.get("https://demoqa.com/buttons");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

          Actions action = new Actions(driver);

          action.click(driver.findElement(By.xpath("//button[text()='Click Me']")))
                  .pause(Duration.ofSeconds(2))
                  .contextClick(driver.findElement(By.xpath("//button[text()='Right Click Me']")))
                  .pause(Duration.ofSeconds(2))
                  .doubleClick(driver.findElement(By.xpath("//button[text()='Double Click Me']")))
                  .perform();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }

    }
}
