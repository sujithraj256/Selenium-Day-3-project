package org.xpathday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\java\\SeleniumDay3\\google\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement findElement = driver.findElement(By.xpath("//input[@ng-model ='FirstName']"));
		findElement.sendKeys("sujith");
		
		
		WebElement findElement2 = driver.findElement(By.xpath("//input[@ng-model ='LastName']"));
		findElement2.sendKeys("Raj");
		
		WebElement findElement3 = driver.findElement(By.xpath("//textarea[@ng-model ='Adress']"));
		findElement3.sendKeys("east madras anna nagar");
		
		WebElement findElement4 = driver.findElement(By.xpath("//input[@ng-model ='EmailAdress']"));
		findElement4.sendKeys("sujithraj256@gmail.com");
		
		WebElement findElement5 = driver.findElement(By.xpath("//input[@ng-model ='Phone']"));
		findElement5.sendKeys("9876543210");
		
		WebElement findElement6 = driver.findElement(By.xpath("//input[@name ='radiooptions']"));
		findElement6.click();
		
		WebElement findElement7 = driver.findElement(By.xpath("//input[@id ='checkbox1']"));
		findElement7.click();
		
		WebElement findElement8 = driver.findElement(By.xpath("//input[@id ='checkbox2']"));
		findElement8.click();
		
		WebElement findElement9 = driver.findElement(By.xpath("//input[@id ='checkbox3']"));
		findElement9.click();
		
		WebElement findElement10 = driver.findElement(By.xpath("//select[@id ='Skills']"));
		findElement10.sendKeys("c++");
		
		WebElement findElement11 = driver.findElement(By.xpath("//select[@id ='yearbox']"));
		findElement11.sendKeys("1999");
		
		WebElement findElement12 = driver.findElement(By.xpath("//select[@ng-model ='monthbox']"));
		findElement12.sendKeys("june");
		
		WebElement findElement13 = driver.findElement(By.xpath("//select[@ng-model ='daybox']"));
		findElement13.sendKeys("25");
		
		WebElement findElement14 = driver.findElement(By.xpath("//input[@id ='firstpassword']"));
		findElement14.sendKeys("sujithraj123");
		
		WebElement findElement15 = driver.findElement(By.xpath("//input[@id ='secondpassword']"));
		findElement15.sendKeys("sujithraj123");
		
		WebElement findElement16 = driver.findElement(By.xpath("//button[@id ='submitbtn']"));
		findElement16.click();
		
		
	
		
		
	}

}
