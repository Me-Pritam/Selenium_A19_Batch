package actionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingClickMethod
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

          driver.get("https://demoapps.qspiders.com/");

          Actions action = new Actions(driver);

          action.click(driver.findElement(By.xpath("//a[@href='/ui']")))
                  .perform();

          action.click(driver.findElement(By.xpath("//a[.='Button']")))
                  .perform();

          action.click(driver.findElement(By.xpath("//button[text()='No']")))
                  .perform(); 
      }
      catch (Exception e)
      {
          e.printStackTrace();

      }
    }
}
