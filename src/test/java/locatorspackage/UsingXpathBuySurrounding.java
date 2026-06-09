package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathBuySurrounding
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.yatra.com/");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//div[@aria-label='Departure Date inputbox']"))
                  .click();

          Thread.sleep(2000);

          for(;;)
          {
              String monthName= driver.findElement(By.xpath("//span[contains(@class,'react-datepicker__current-month')]"))
                      .getText();

              if (monthName.equals("August 2026"))
              {
                  driver.findElement(By.xpath("(//span[contains(@class,'react-datepicker__current-month')]/../../../..//span[contains(text(),'30')])[2]"))
                          .click();
                  break;
              }
              else {

                  Thread.sleep(1000);

                  System.out.println(monthName);

                  driver.findElement(By.xpath("(//button[@aria-label='Next Month'])[2]"))
                          .click();
              }
          }
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
