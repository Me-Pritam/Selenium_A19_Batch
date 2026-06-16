package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogInUsingXpathByAxes
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.instagram.com/");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//button[.='Log in']"))
                  .click();








          Thread.sleep(2000);

          driver.findElement(By.xpath("//input[@name='email']"))
                  .sendKeys("");

          Thread.sleep(500);

          driver.findElement(By.xpath("//input[@name='pass']"))
                  .sendKeys("");


          Thread.sleep(2000);
          driver.findElement(By.xpath("//div[@aria-label='Log In']"))
                  .click();

          Thread.sleep(4000);

          driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Search']"))
                  .click();

          Thread.sleep(2000);

          driver.findElement(By.xpath("//input[@aria-label='Search input']"))
                  .sendKeys("Fifa");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//a[@href='/fifa/']"))
                  .click();

          Thread.sleep(2000);

          driver.findElement(By.xpath("//button[.='Follow']"))
                  .click();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
