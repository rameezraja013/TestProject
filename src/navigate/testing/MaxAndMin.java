package navigate.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaxAndMin 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rameezraja\\Desktop\\Selenium jar\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		//current url
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}

}
