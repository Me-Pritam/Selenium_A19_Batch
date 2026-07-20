package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlingSingleSelectModernDropdown
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

          driver.get("https://demoqa.com/select-menu");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

          driver.findElement(By.xpath("//div[@id='selectOne']"))
                  .click();

        List<WebElement> allOptions = driver.findElements(By.xpath("//div[@role='option']"));

        for(WebElement option : allOptions)
        {
            if (option.getText().equals("Prof."))
            {
                option.click();
                break;
            }
        }

      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
