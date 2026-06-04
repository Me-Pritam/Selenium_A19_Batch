package webdriverpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) 
	{
		try 
		{
			WebDriver driver = new ChromeDriver();
			
			String givenUrl = "https://www.amazon.in/";
			
			driver.get(givenUrl);
			
			Thread.sleep(2000);
						
			String actualURL = driver.getCurrentUrl();
			
			if (actualURL.equals(givenUrl)) 
			{
				System.out.println("The URL is as expected");
			}
			else {
				System.out.println("The URL is different");
			}

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}
