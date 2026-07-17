package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HandlingSingleSelectDropDown
{
    public static void main(String[] args)
    {
       try
       {
           WebDriver driver = new ChromeDriver();

           driver.manage().window().maximize();

           driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

           driver.get("https://practice.expandtesting.com/dropdown");

           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

           Select selectCountry = new Select(driver.findElement(By.xpath("//select[@name='country']")));

           selectCountry.selectByVisibleText("India");

           Thread.sleep(2000);

           selectCountry.deselectByVisibleText("India");
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}
