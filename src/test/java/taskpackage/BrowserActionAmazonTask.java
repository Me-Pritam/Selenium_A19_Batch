package taskpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActionAmazonTask
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            String desiredUrl = "https://www.amazon.in/";

            driver.get(desiredUrl);

            Thread.sleep(2000);

            if(driver.getCurrentUrl().equals(desiredUrl))
            {
                driver.manage().window().maximize();

                if(driver.getTitle().contains("Shopping"))
                {
                    driver.manage().window().fullscreen();
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
