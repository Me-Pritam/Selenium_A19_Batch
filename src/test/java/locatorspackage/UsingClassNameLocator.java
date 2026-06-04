package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingClassNameLocator
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://demowebshop.tricentis.com/");

            Thread.sleep(2000);

            driver.findElement(By.className("ico-register")).click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
