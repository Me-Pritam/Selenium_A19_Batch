package synchronizationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class UsingFluentWaitInSwiggy
{
    public static void main(String[] args)
    {
       try
       {
           WebDriver driver = new ChromeDriver();

           driver.manage().window().maximize();

//           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

           driver.get("https://www.zepto.com/");

           FluentWait<WebDriver> wait = new FluentWait<>(driver);


           wait.withTimeout(Duration.ofSeconds(10));

           wait.ignoring(Exception.class);

           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='Toys']")))
                   .click();

           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Activities & Sports']")))
                   .click();

           wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'soft-bullet-gun-foam-dart-gun-with-10-safe-bullets')]")))
                   .click();




       }
       catch (Exception e)
       {
           e.printStackTrace();
       }

    }
}
