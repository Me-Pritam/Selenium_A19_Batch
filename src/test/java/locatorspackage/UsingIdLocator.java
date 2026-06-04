package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIdLocator
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.saucedemo.com/");

          Thread.sleep(2000);

          driver.findElement(By.id("user-name")).sendKeys("standard_user");

          Thread.sleep(2000);

          driver.findElement(By.name("password")).sendKeys("secret_sauce");

          Thread.sleep(2000);

          driver.findElement(By.id("login-button")).click();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
