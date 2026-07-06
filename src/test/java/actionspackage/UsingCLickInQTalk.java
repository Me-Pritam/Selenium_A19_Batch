package actionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingCLickInQTalk
{
    public static void main(String[] args)
    {
     try
     {
         ChromeOptions options = new ChromeOptions();

         options.addArguments("--incognito");

         WebDriver driver = new ChromeDriver(options);

         driver.manage().window().maximize();

         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

         driver.get("https://chat.qspiders.com/");

         Actions action = new Actions(driver);

         action.click(driver.findElement(By.xpath("//button[normalize-space()='User']")))
                 .perform();
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }

    }
}
