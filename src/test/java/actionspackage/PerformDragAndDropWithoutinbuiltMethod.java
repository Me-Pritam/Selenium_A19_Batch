package actionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class PerformDragAndDropWithoutinbuiltMethod
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

          driver.get("https://excalidraw.com/");

          Actions action = new Actions(driver);

          action.click(driver.findElement(By.xpath("//input[@aria-label='Draw']")))
                  .moveByOffset(-100,100)
                  .pause(Duration.ofSeconds(1))
                  .clickAndHold()
                  .pause(Duration.ofSeconds(1))
                  .moveByOffset(100,0)
                  .pause(Duration.ofSeconds(1))
                  .release()
                  .pause(Duration.ofSeconds(1))
                  .clickAndHold()
                  .pause(Duration.ofSeconds(1))
                  .moveByOffset(-100,0)
                  .pause(Duration.ofSeconds(1))
                  .release()

                  .perform();

      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
