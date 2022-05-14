package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {

	public static void main(String[] args) {
		
		String url = "https://opensource-demo.orangehrmlive.com/";
		String actualTitle = "OrangeHRM";
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Browser Launched");
		driver.manage().window().maximize();
		System.out.println("Browser Maximized");
		
		//xPath
		// - //tagname[@attribut='attribute Value']
		WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@class='button']"));
		loginButton.click();
		
		
		
		
	}

}
