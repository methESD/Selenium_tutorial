package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByElement {

	public static void main(String[] args) {
		
		//open chrome browser
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Chromedrive//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//max the chrome browser
		driver.manage().window().maximize();
		
		//navigate to the url
		driver.get("http://automationpractice.com/index.php");
		System.out.println(driver.getTitle());
		
		
		//[by ID]
		
//		driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");
		
//		WebElement search = driver.findElement(By.id("search_query_top"));
//		search.sendKeys("T-Shirts");
		
		//[by Name]
		
		driver.findElement(By.name("search_query")).sendKeys("Shirts");
		
		
	}

}
