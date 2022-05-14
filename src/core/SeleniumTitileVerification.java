package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTitileVerification {

	public static void main(String[] args) {
		String url = "https://opensource-demo.orangehrmlive.com/";
		String actualTitle = "OrangeHRM";
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Browser Launched");
		driver.manage().window().maximize();
		System.out.println("Browser Maximized");
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement clickOnLogin = driver.findElement(By.name("Submit"));
		clickOnLogin.click();
		
		String expectedTitle = driver.getTitle();
		System.out.println("Expected Title: " +expectedTitle);
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched and Test Passed");
		} else {
			System.out.println("Title not matched and Test not Passed");
		}
		
		driver.quit();
	}

}
