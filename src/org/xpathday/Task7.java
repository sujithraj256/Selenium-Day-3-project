package org.xpathday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\java\\SeleniumDay3\\google\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
		findElement.sendKeys("8526092020");
		
	}

}
