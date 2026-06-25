package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class UsingGetTextmethod
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

          driver.get("https://demoapps.qspiders.com/ui/link?sublist=0");

          List<WebElement> allLinks = driver.findElements(By.tagName("a"));

          for(WebElement element : allLinks){
              if (element.getText().equals("Career")) {
                  element.click();
                  break;
              }
          }
          driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");

          WebElement desiredTag = driver.findElement(By.cssSelector("*#btn"));

          if (desiredTag.getTagName().equals("button"))
          {
              desiredTag.click();
          }
          else{
              System.out.println("It is not a button tag");
          }
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
