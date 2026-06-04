package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByIndex_Contains
{
    public static void main(String[] args)
    {
     try
     {
         WebDriver driver = new ChromeDriver();

         driver.manage().window().maximize();

         driver.get("https://www.amazon.in/");

         Thread.sleep(4000);

         driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                 .sendKeys("Vivo x300 Pro");

         Thread.sleep(2000);

         driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"))
                 .click();

         Thread.sleep(2000);

         driver.findElement(By.xpath("//li[contains(@id,'p_n_size_two_browse-vebin/15564005031')]"))
                 .click();

         Thread.sleep(2000);

         driver.findElement(By.xpath("(//h2[contains(@class,'a-size-medium a-spacing-none ')])[2]"))
                 .click();

     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
    }
}
