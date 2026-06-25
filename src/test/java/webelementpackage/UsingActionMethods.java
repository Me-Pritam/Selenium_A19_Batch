package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UsingActionMethods
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

          driver.get("https://in.linkedin.com/");

          driver.findElement(By.xpath("//a[normalize-space()='Sign in']"))
                  .click();

         WebElement emailField =  driver.findElement(By.xpath("(//label[.='Email or phone']/parent::div/descendant::input[@type='email'])[2]"));

//         WebElement passwordField = driver.findElement(By.xpath("//input[@id='«R2nvl3ksopa55j6»']"));

         emailField.sendKeys("john@gmail.com");

//         passwordField.sendKeys("Password@12345678");

         Thread.sleep(2000);

         emailField.clear();

         Thread.sleep(1000);

         emailField.sendKeys("robin@gmil.com");

         driver.findElement(By.xpath("(//button[.='Sign in'])[2]")).sendKeys(Keys.ENTER);




      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
