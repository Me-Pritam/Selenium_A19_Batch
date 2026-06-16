package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class USingXpathByAxesInAmazon
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.amazon.in/");

          Thread.sleep(6000);

          driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                  .sendKeys("Asus ROG");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"))
                  .click();

          Thread.sleep(2000);


         List<WebElement> allPrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

         for(WebElement price: allPrices)
         {
             System.out.println(price.getText());
         }

      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
