package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class UsingGetAtrributeInAmazon
{
    public static void main(String[] args)
    {
      try
      {
          String desiredProduct = "sony bluetooth headphones wireless";

          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

          driver.get("https://www.amazon.in/");

          WebElement searchField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

          searchField.sendKeys(desiredProduct);

          driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"))
                  .sendKeys(Keys.ENTER);

          String actualAttributeValue = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).getAttribute("value");

          if (actualAttributeValue.equals(desiredProduct)) {
              System.out.println("The Desired Product is sent to backend");
          }
          else{
              System.out.println("the Desired Product is not sent to backend");
          }

      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}

//Vivo x200 pro
//Samsung S26 Ultra
//oneplus 15r
//nothing 4a pro
