package synchronizationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class UsingFluentWait
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

            driver.get("https://www.shoppersstack.com/");


            FluentWait<WebDriver> wait = new FluentWait(driver);

            wait.pollingEvery(Duration.ofSeconds(2));
            wait.withTimeout(Duration.ofSeconds(20));
            wait.ignoring(Exception.class);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='loginBtn']")))
                            .click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='Email']")))
                    .sendKeys("mydummy@gmail.com");

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='Password']")))
                    .sendKeys("Password@12345");

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Login']")))
                    .click();




            //
            //
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
