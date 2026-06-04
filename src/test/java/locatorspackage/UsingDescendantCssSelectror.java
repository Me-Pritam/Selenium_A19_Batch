package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingDescendantCssSelectror
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.cricbuzz.com/");

          Thread.sleep(2000);

          driver.findElement(By.cssSelector("[class*='flex overflow-x-scroll'] [title='RCB: All Access']"))
                  .click();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
