package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HanldingTraditionalMultiSelectDropDown
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new FirefoxDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

            driver.get("https://vinothqaacademy.com/drop-down/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            Actions action = new Actions(driver);

            action.scrollToElement(driver.findElement(By.xpath("//div[contains(text(),'© 2025 V-Tech Solutions Ltd (UK), Reg. No: 16489105')]")))
                    .perform();

            Select selectMulti = new Select(driver.findElement(By.xpath("//select[@name='programming']")));

            ArrayList<String> languages = new ArrayList(List.of("Java","Python","JavaScript"));

            if (selectMulti.isMultiple())
            {
//                selectMulti.selectByVisibleText("Java");
//                selectMulti.selectByVisibleText("JavaScript");
//                selectMulti.selectByVisibleText("Python");

                List<WebElement> allOptions = selectMulti.getOptions();

                for(WebElement options : allOptions)
                {
                    String visibleText = options.getText();

                    if (languages.contains(visibleText))
                    {
                        options.click();
                    }
                }


            }
            else{
                System.out.println("It is not a multiSelect dropdown");
            }

            Thread.sleep(2000);

//            selectMulti.deselectByVisibleText("JavaScript");
//            selectMulti.deselectAll();

            List<WebElement> allSelectedOptionstions= selectMulti.getAllSelectedOptions();





        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
