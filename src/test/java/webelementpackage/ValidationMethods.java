package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ValidationMethods
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

//          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

          driver.get("https://demoqa.com/text-box");

          WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

          WebElement submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='submit']")));

          if (submitButton.isDisplayed())
          {
              System.out.println("The Submit button is displayed");
          }
          else {
              System.out.println("The Submit button is not displayed");

          }

          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[.='Elements']")))
                  .click();

          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/radio-button']")))
                  .click();

          WebElement yesRadioButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='yesRadio']")));
          WebElement noRadioButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='noRadio']")));

          if (yesRadioButton.isSelected())
          {
              System.out.println("The Yes Radio Button is Selected");
          }
          else
          {
            yesRadioButton.click();

              System.out.println("The Yes Radio button was not selected , that's why it is clicked");
          }

          if (noRadioButton.isEnabled())
          {
              System.out.println("The No Radio button is enabled");
          }
          else{

              System.out.println("The No Radio button is disabled");
          }
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
