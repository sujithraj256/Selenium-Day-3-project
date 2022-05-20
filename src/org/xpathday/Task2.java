package org.xpathday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\java\\SeleniumDay3\\google\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get(" https://www.facebook.com/");
		
		
		WebElement findElement = driver.findElement(By.xpath("//input[@id ='email']"));
		findElement.sendKeys("sujithraj256@gmail.com");
		
		WebElement findElement2 = driver.findElement(By.xpath("//input[@id = 'pass']"));
		findElement2.sendKeys("23456789");
		
		WebElement findElement3 = driver.findElement(By.xpath("//button[@type ='submit']"));
		findElement3.click();

		
	}

}
