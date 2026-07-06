package actionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingDragAndDrop
{
    public static void main(String[] args)
    {
       try
       {
           WebDriver driver = new ChromeDriver();

           driver.manage().window().maximize();

           driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

           driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");

           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

           WebElement mobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));

           WebElement mobileAcceseries = driver.findElement(By.xpath("//div[contains(@class,'drop-column  min-h-[200px] bg-slate-100')]"));

           Actions action = new Actions(driver);

           action.dragAndDrop(mobileCharger,mobileAcceseries)
                   .perform();




       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}
