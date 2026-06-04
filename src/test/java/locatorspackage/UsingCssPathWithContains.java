package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssPathWithContains
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.amazon.in/");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("input[id*='search']"))
                    .sendKeys("Vivo x300");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("input[class*='nav-input'][type='submit']"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
