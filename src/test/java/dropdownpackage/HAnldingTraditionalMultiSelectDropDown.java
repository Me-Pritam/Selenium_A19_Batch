package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HAnldingTraditionalMultiSelectDropDown
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

            driver.get("https://vinothqaacademy.com/drop-down/");

            Actions action = new Actions(driver);

            action.scrollToElement(driver.findElement(By.xpath("//div[contains(text(),'© 2025 V-Tech Solutions Ltd (UK), Reg. No: 16489105')]")))
                    .perform();

            Select selectMulti = new Select(driver.findElement(By.xpath("//select[@name='programming']")));

            if (selectMulti.isMultiple())
            {
                selectMulti.selectByVisibleText("Java");
                selectMulti.selectByVisibleText("JavaScript");
                selectMulti.selectByVisibleText("Python");
            }
            else{
                System.out.println("It is not a multiSelect dropdown");
            }




        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
