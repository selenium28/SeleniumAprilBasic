package core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandle {

	public static void main(String[] args) {
		
		
		String url = "https://demo.guru99.com/test/delete_customer.php";

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Browser Launched");
		driver.manage().window().maximize();
		System.out.println("Browser Maximized");
		
		WebElement customerID = driver.findElement(By.name("cusid"));
		customerID.sendKeys("Selenium");
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));
		submitButton.click();
		
		// Alert is a interface in Selenium
		Alert alert = driver.switchTo().alert();
//		alert.accept();
		alert.dismiss();
		System.out.println("Popup handled");

	}

}
