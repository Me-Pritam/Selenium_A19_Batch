package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HandlingMultiSelectModernDropDown
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

          driver.findElement(By.xpath("//div[@class='css-b62m3t-container' and .='Select...']"))
                  .click();

          ArrayList<String> desiredColour = new ArrayList<>(List.of("Red","Green","Black"));

          List<WebElement> allColours = driver.findElements(By.xpath("//div[@class='css-qr46ko']/child::div"));

          for(WebElement colour : allColours)
          {
              if (desiredColour.contains(colour.getText()))
              {
                  colour.click();
              }
          }

      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
