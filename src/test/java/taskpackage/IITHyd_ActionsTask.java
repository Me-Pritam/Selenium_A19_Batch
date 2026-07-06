package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class IITHyd_ActionsTask
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--headless" ));

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

            driver.get("https://www.iith.ac.in/");

//            wait.until(ExpectedConditions.urlToBe("https://www.iith.ac.in/"));

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            String mainPage = driver.getWindowHandle();

            Actions action = new Actions(driver);

            action.click(driver.findElement(By.xpath("//a[@href='/careers']")))
                    .perform();

            action.click(driver.findElement(By.xpath("//a[normalize-space()='Visit Careers Portal']")))
                    .perform();

            Set<String> allPages = driver.getWindowHandles();

            for(String pageId : allPages)
            {
                if (pageId.equals(mainPage))
                {
                    continue;
                }
                else{
                    driver.switchTo().window(pageId);
                    break;
                }
            }

            List<WebElement> allJobs = driver.findElements(By.xpath("//div[@class='flex flex-col gap-4 relative']/child::div"));

            for(WebElement jobs:allJobs)
            {
                System.out.println(jobs.getText());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
