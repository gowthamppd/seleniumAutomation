package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {
	 public static void main(String[] args) {
	    	System.setProperty("webdriver.edge.driver","C:\\selenium-java-3.14.0\\Drivers\\MicrosoftWebDriver.exe");
	    	WebDriver driver = new EdgeDriver();
	    	driver.get("http://demo.guru99.com/test/newtours/index.php");
	    	
	    	String expectedTitle = "Welcome: Mercury Tours"; 
	    	String actualTitle = driver.getTitle();
	    	
	    	if (expectedTitle.contentEquals(actualTitle))
	    		{
	    			System.out.println("Proper Web page opened");
	    		}
	    	else
	    		{
	    			System.out.println("Proper Web page not opened");
	    		}
	    			
	    	WebElement username = driver.findElement(By.name("userName"));
	    	username.click();
	    	username.sendKeys("invalidUNN");
	    	
	    	WebElement password = driver.findElement(By.name("password"));
	    	password.click();
	    	password.sendKeys("invalidPWD");
	    	
	    	WebElement login = driver.findElement(By.name("submit"));
	    	login.click();
	    	
	    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	
	      System.out.println("Prog Executed");
	        driver.close();
	        driver.quit();
	}
}
