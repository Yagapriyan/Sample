package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1
{
	public static void main(String [] args) 
	{
		System.setProperty("webdriver.gecko.driver", "/home/alexander/Documents/Selenium/geckoDriver/firefox/firefox"); 
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.google.co.in");
		//driver.close();
	}

}
