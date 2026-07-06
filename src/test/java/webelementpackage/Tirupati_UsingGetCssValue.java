package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Tirupati_UsingGetCssValue
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

//          driver.get("https://www.tirumala.org/");

          driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//          WebElement templeLink = driver.findElement(By.xpath("//a[text()='Temples']"));

//          System.out.println(templeLink.getCssValue("font-family"));

          WebElement yesButton = driver.findElement(By.xpath("//button[text()='Yes']"));

          System.out.println(yesButton.getCssValue("background-color"));

          System.out.println(yesButton.getCssValue("font-family"));

          System.out.println(yesButton.getSize());

          System.out.println(yesButton.getLocation());

          System.out.println(yesButton.getRect().getDimension());
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
