package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkText_PartialLinkText
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://demowebshop.tricentis.com/");

          Thread.sleep(2000);

          driver.findElement(By.linkText("Shopping cart\n(0)")).click();

//          Thread.sleep(2000);

//          System.out.println(driver.findElement(By.partialLinkText("Shopping cart")).getText());

      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
