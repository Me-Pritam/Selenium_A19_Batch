package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class DemoAppQspidersTask
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

          driver.get("https://demoapps.qspiders.com/");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

          Actions action = new Actions(driver);

          action.click(driver.findElement(By.xpath("//a[@href='/ui']")))
                  .perform();

          action.click(driver.findElement(By.xpath("//a[@href='/ui/checkbox']")))
                  .perform();

          List<WebElement> allNotificationsApp = driver.findElements(By.xpath("//p[contains(text(),'notifications')]/following-sibling::main/div"));

          for(WebElement app : allNotificationsApp)
          {
              if (app.getText().contains("Yahoo"))
              {
                  action.click(app.findElement(By.xpath("./child::input"))).perform();
                  break;
              }
          }

          List<WebElement> allProducts = driver.findElements(By.xpath("//p[contains(text(),'recommendations ')]/following-sibling::main/div"));

          for(WebElement product : allProducts)
          {
              if (product.getText().contains("Sandals"))
              {
                  action.click(product.findElement(By.xpath("./input")))
                          .perform();
                  break;
              }
          }

          action.click(driver.findElement(By.xpath("//p[contains(text(),'assistance')]/following-sibling::main/div[contains(.,'same product')]/input")))
                  .perform();

          action.click(driver.findElement(By.xpath("//input[@id='mode_g']")))
                  .perform();

          action.click(driver.findElement(By.xpath("//button[@id='togglers']")))
                  .perform();

          String oderConfirmation = driver.findElement(By.xpath("//p[@class='text-center pt-3 text-lg']")).getText();

          System.out.println(oderConfirmation);
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
