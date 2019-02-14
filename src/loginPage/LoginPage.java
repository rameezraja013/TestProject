package loginPage;

import org.openqa.selenium.By.ById;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rameezraja\\Desktop\\Selenium jar\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("rameez.raja0189@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("rameez8123");
		driver.findElement(By.id("loginbutton")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}

}
