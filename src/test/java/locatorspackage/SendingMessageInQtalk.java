package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingMessageInQtalk
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://chat.qspiders.com/");

          Thread.sleep(2000);

          driver.findElement(By.cssSelector("input[name='username']"))
                  .sendKeys("ijiopritam@gmail.com");

          Thread.sleep(1000);

          driver.findElement(By.cssSelector("input[name='password']"))
                  .sendKeys("Haloqspiders#1122");








          driver.findElement(By.cssSelector("button[type='submit']"))
                  .click();

          Thread.sleep(4000);

          driver.findElement(By.cssSelector("input[name='search']"))
                  .sendKeys("Govind Raj P");

          Thread.sleep(2000);

//          driver.findElement(By.cssSelector("div._chat_chatMenuWrapper__OgmMk button"))
//                  .click();

          Thread.sleep(2000);

          driver.findElement(By.cssSelector("div[class*=_chat_ConversationBlock]>div"))
                  .click();

          Thread.sleep(2000);

          driver.findElement(By.cssSelector("textarea#message"))
                  .sendKeys("It is an automated message sent using Selenium. Please Ignore");

          Thread.sleep(2000);

          driver.findElement(By.cssSelector("button[class='chatSubmitButton'][type='button']"))
                  .click();


      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
