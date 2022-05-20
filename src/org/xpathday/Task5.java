package org.xpathday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\java\\SeleniumDay3\\google\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/trains");
		
		
		WebElement findElement = driver.findElement(By.xpath("//input[@id = 'from_station']"));
		findElement.sendKeys("kumbakonam (KMU)");
		
		WebElement findElement1 = driver.findElement(By.xpath("//input[@id = 'to_station']"));
		findElement1.sendKeys("chennai Beach (MAS)");
		
		WebElement findElement3 = driver.findElement(By.xpath("//select[@id = 'trainClass']"));
		findElement3.sendKeys("sleeper(SL)");
		
		WebElement findElement4 = driver.findElement(By.xpath("//input[@id = 'dpt_date']"));
		findElement4.sendKeys("25/06/2022");
		

		WebElement findElement5 = driver.findElement(By.xpath("//button[@id = 'trainFormButton']"));
		findElement5.click();
		
		
		
	
	}

}
