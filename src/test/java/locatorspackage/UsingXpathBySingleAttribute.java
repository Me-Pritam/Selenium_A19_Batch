package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathBySingleAttribute
{
    public static void main(String[] args)
    {
     try
     {
         WebDriver driver = new ChromeDriver();

         driver.manage().window().maximize();

         driver.get("https://www.facebook.com/");

         Thread.sleep(2000);

         driver.findElement(By.xpath("//input[@name='email']"))
                 .sendKeys("johndoe@gmail.com");

         Thread.sleep(2000);

         driver.findElement(By.xpath("//input[@name='pass']"))
                 .sendKeys("Password@123456");

         Thread.sleep(2000);

         driver.findElement(By.xpath("//span[text()='Log in']"))
                 .click();
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
    }
}
