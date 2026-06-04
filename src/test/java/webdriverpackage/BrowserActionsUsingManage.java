package webdriverpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActionsUsingManage 
{
	public static void main(String[] args) {
		
		try 
		{
			WebDriver driver = new ChromeDriver();
			
			Thread.sleep(2000);
			
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			driver.manage().window().fullscreen();
			
			Thread.sleep(2000);
			
			driver.manage().window().minimize();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
