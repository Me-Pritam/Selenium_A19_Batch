package taskpackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeingDesiredSizeBrowser
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            Point browserPosition = driver.manage().window().getPosition();

            if (browserPosition.getX()<1000 && browserPosition.getY()<1000)
            {
               Dimension browserDimension = driver.manage().window().getSize();

                if (browserDimension.getWidth()<800 && browserDimension.getHeight()<600)
                {
                    driver.get("https://qspiders.com/");
                }

                else{

                    driver.manage().window().setSize(new Dimension(600,550));

                    driver.get("https://chat.qspiders.com/");
                }
            }
            else
            {
               driver.manage().window().setPosition(new Point(500,600));

               driver.get("https://www.facebook.com/");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
