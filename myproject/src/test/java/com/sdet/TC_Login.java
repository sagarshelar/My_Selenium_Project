package com.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC_Login {
	
	
	@Test
	public void login_Test() throws InterruptedException
	{
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		Thread.sleep(300);
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		Thread.sleep(1000);
		driver.close();
	
	}

}
