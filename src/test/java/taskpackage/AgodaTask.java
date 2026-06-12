package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgodaTask
{
    public static void main(String[] args)
    {
       try
       {
           WebDriver driver = new ChromeDriver();

           driver.manage().window().maximize();

           driver.get("https://www.agoda.com/");

           Thread.sleep(2000);

           driver.findElement(By.xpath("//li[@id='tab-flight-tab']"))
                   .click();

           Thread.sleep(2000);

           driver.findElement(By.xpath("//div[@aria-label='Departure']"))
                   .click();

           Thread.sleep(2000);

           for(;;){

               String monthName = driver.findElement(By.xpath("//div[contains(@class,'DayPicker-Caption DayPicker-Caption-Wide')]"))
                       .getText();

               if (monthName.equals("September 2026"))
               {
                   driver.findElement(By.xpath("//div[contains(@class,'DayPicker-Caption DayPicker-Caption-Wide')]/..//span[text()='16']"))
                           .click();

                   break;
               }
               else {
                   Thread.sleep(2000);

                   driver.findElement(By.xpath("//button[@aria-label='Next Month']"))
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
