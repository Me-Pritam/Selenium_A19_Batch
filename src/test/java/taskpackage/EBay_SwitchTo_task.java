package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class EBay_SwitchTo_task
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.ebay.com/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            //Thread.sleep(2000);

            String parentID = driver.getWindowHandle();

            driver.findElement(By.xpath("//input[@title='Search']"))
                    .sendKeys("BRASIL JERSY");

            //Thread.sleep(2000);

            driver.findElement(By.xpath("//button[@value='Search']"))
                    .click();

            //Thread.sleep(4000);

            driver.findElement(By.xpath("(//ul[contains(@class,'srp-results srp-list clearfix')]/child::li/descendant::div[@class='su-card-container__header'])[1]"))
                    .click();

            //Thread.sleep(2000);

            Set<String> allPageIds = driver.getWindowHandles();

            for(String pageId : allPageIds)
            {
                if (pageId.equals(parentID))
                {
                    continue;
                }
                else {
                    driver.switchTo().window(pageId);
                    break;
                }
            }



            //Thread.sleep(4000);

//            driver.findElement(By.xpath("(//a[.='See in cart'])[2]"))
//                    .click();

//            driver.close();
            driver.quit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
