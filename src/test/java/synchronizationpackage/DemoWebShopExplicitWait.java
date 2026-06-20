package synchronizationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoWebShopExplicitWait
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

            driver.get("https://demowebshop.tricentis.com/");

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));


            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login']")))
                    .click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Email']")))
                    .sendKeys("themail@gmail.com");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Password']")))
                    .sendKeys("Password@1234");

            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@value='Log in']"))))
                            .click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/electronics']")))
                    .click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Camera, photo' and @title='Show products in category Camera, photo']")))
                    .click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Digital SLR Camera 12.2 Mpixel']")))
                    .click();

            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Add your review']"))))
                    .click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='AddProductReview_Title']")))
                    .sendKeys("Camera Review after purchase");

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='AddProductReview_ReviewText']")))
                    .sendKeys("Excellet Product");

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@name='AddProductReview.Rating'])[3]")))
                    .click();



        }



        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
