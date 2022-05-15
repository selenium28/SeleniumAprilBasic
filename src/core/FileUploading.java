package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {

	public static void main(String[] args) {
		
		String url = "http://demo.guru99.com/test/upload/";

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Browser Launched");
		driver.manage().window().maximize();
		System.out.println("Browser Maximized");
		
		WebElement chooseFile = driver.findElement(By.name("uploadfile_0"));
		chooseFile.sendKeys("C:\\Users\\devid\\OneDrive\\Desktop\\EnCap.png");
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkBox.click();
		
		WebElement submitButton = driver.findElement(By.id("submitbutton"));
		submitButton.click();
		
	}

}
