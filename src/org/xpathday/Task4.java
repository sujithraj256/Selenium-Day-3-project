package org.xpathday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\java\\SeleniumDay3\\google\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://greenstech.in/selenium-course-content.html");
		
		WebElement findElement = driver.findElement(By.xpath("//h2[@class ='title mb-0 center']"));
		findElement.click();
		
		WebElement findElement1 = driver.findElement(By.xpath("//a[@title ='Interview Questions']"));
		findElement1.click();
	}

}
