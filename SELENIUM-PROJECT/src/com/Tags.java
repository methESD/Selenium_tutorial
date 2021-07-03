package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open chrome browser
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Chromedrive//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
   
		//max the chrome browser
		driver.manage().window().maximize();
		
		//navigate to the url
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		//[By TagName]
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		
		//name of the links
		for(WebElement l : link) {
			System.out.println(l.getText());
		}
		

	}

}
