package webdriverpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingPageSourceMethod {

	public static void main(String[] args) 
	{
		try 
		{
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			
			Thread.sleep(2000);
			
			
			System.out.println(driver.getPageSource());
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		

	}

}
