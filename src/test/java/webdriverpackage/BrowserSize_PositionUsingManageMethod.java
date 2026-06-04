package webdriverpackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSize_PositionUsingManageMethod
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.get("https://www.netflix.com/in/");

          Thread.sleep(2000);

          driver.manage().window().setSize(new Dimension(600,600));

          Thread.sleep(1000);

          System.out.println(driver.manage().window().getSize());


          driver.manage().window().setPosition(new Point(500,400));

          Thread.sleep(1000);

          driver.manage().window().setPosition(new Point(200,300));

          Thread.sleep(1000);

          driver.manage().window().setPosition(new Point(50,10));

          Thread.sleep(1000);

          driver.manage().window().setPosition(new Point(450,800));

          Thread.sleep(1000);

          driver.manage().window().setPosition(new Point(10,10));

      } catch (Exception e) {
          e.printStackTrace();
      }
    }
}
