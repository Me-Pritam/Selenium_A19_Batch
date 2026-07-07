package actionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RandomMotionUsingDragAndDropBy
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

            driver.get("https://testautomationcentral.com/demo/drag_and_drop.html");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            Actions actions = new Actions(driver);

            WebElement dragBox = driver.findElement(By.xpath("//div[@id='draggable']"));

            actions.dragAndDropBy(dragBox,200,300)
                    .dragAndDropBy(dragBox,-500,-400)
                    .dragAndDropBy(dragBox,400,600)
                    .dragAndDropBy(dragBox,-500,-200)
                    .perform();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
