package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicConcept {

	public static void main(String[] args) {
		
//		WebDriver driver = new WebDriver();  //We can't create object of interface.
		
		WebDriver driver = new ChromeDriver(); // Correct
		
		ChromeDriver driver3 =new ChromeDriver(); // Correct
		
		FirefoxDriver driver4 = new FirefoxDriver(); // Correct
		
		WebDriver driver5 = new FirefoxDriver(); // Correct
		// WebDriver - Interface
		// driver - reference variable
		// new - Java keyword
		// ChromeDriver()- constructor
		// new ChromeDriver(); - object
	}

}
