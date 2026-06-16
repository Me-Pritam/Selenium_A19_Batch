package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingRelativeLocator
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://demowebshop.tricentis.com/");

          Thread.sleep(2000);

          driver.findElement(RelativeLocator.with(By.id("small-searchterms"))
                                            .below(By.cssSelector("a[href='/register']")))
                  .sendKeys("Books");
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
