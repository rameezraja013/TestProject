package selenium.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTesting
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rameezraja\\Desktop\\Selenium jar\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle( );
		if (title.equalsIgnoreCase("facebook")) 
		{
			System.out.println("pass");
			
		} 
		else 
		{
			System.out.println("fail");

		}
		driver.quit();
		
		
		
	}

}
