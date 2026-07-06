package actionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingDragAndDropBy
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

          driver.get("https://www.qa-practice.com/elements/dragndrop/boxes");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

          Actions action = new Actions(driver);

          WebElement dragMerBox = driver.findElement(By.xpath("//div[text()='Drag me']"));

          WebElement dropBox = driver.findElement(By.xpath("//div[@id='rect-droppable']"));

          action.dragAndDropBy(dragMerBox,0,-(dragMerBox.getLocation().getY()-dropBox.getLocation().getY()))
                  .perform();
      }
      catch (Exception e)
      {

          e.printStackTrace();
      }
    }
}
