package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			
		    // 2. Initialize Webdriver object through ChromeDriver class.
		  ChromeDriver  browserObject = new ChromeDriver();
		    // 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
		    browserObject.get("https://www.google.com/");
		    
		    browserObject.findElement(By.name("q")).sendKeys("the profit room");
		    
		    browserObject.findElement(By.name("btnK")).submit();
	}

}
