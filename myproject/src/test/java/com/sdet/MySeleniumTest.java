package com.sdet;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MySeleniumTest {
	
	
	public static void main(String[] args) {
	     
	      WebDriver driver = new ChromeDriver();
	      driver.get("http://www.google.com");
	      driver.quit();
	   }

}
