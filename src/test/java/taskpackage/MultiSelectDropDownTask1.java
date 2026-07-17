package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MultiSelectDropDownTask1
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

          driver.get("https://vinothqaacademy.com/drop-down/");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

          Actions action = new Actions(driver);

          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

          WebElement dropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'© 2025 V-Tech Solutions Ltd (UK), Reg. No: 16489105')]")));

          action.scrollToElement(dropDown).perform();

          action.click(driver.findElement(By.xpath("//span[contains(@class,'select2-selection select2-selection--multiple')]")))
                  .perform();

          WebElement java = driver.findElement(By.xpath("//li[text()='Java']"));
          WebElement javascript = driver.findElement(By.xpath("//li[text()='JavaScript']"));
          WebElement python = driver.findElement(By.xpath("//li[text()='Python']"));

          action.keyDown(Keys.CONTROL)
                  .pause(Duration.ofSeconds(1))
                  .click(java)
                  .click(javascript)
                  .click(python)
                  .keyUp(Keys.CONTROL)
                  .perform();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
