package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UsingCssPathForTable
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");

          Thread.sleep(2000);

          List<WebElement> allSalary = driver.findElements(By.cssSelector("table.table.table-striped.mt-3 tr>td:nth-child(5)"));

          for(WebElement salary:allSalary)
          {
              System.out.println(salary.getText());
          }
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
