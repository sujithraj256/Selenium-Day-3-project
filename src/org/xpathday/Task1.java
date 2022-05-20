package org.xpathday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\java\\SeleniumDay3\\google\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement findElement = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		findElement.sendKeys("iphone");
		WebElement findElement2 = driver.findElement(By.xpath("//input[@id = 'nav-search-submit-button']"));
		findElement2.click();
		
	}

}
