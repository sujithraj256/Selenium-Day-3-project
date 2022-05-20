package org.xpathday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\java\\SeleniumDay3\\google\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement findElement = driver.findElement(By.xpath("//div[@id = 'heading201']"));
		findElement.click();
		
		WebElement findElement2 = driver.findElement(By.xpath("//a[@href ='http://traininginchennai.in/Fresher_Selenium_Resume.pdf']"));
		findElement2.click();
		
	}

}
