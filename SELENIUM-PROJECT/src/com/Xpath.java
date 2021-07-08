package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open chrome browser
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Chromedrive//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
   
		//max the chrome browser
		driver.manage().window().maximize();
		
		//navigate to the url
		driver.get("https://www.ebay.com/");
		
		//Absolute Xpath
		//driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]")).sendKeys("T-Shirt");
		//driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).click();
		
		//Relative Xpath
//		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Frocks for girls");
//		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

		//OR
		//driver.findElement(By.xpath("//input[@id='gh-ac' or @name='_nkw']")).sendKeys("Frocks for ladies");
		//AND
		//driver.findElement(By.xpath("//input[@id='gh-ac' and  @name='_nkw']")).sendKeys("Frocks for ladies");
		
		//contains method
		//driver.findElement(By.xpath("//input[contains(@name,'_nkw')]")).sendKeys("Shirts for kids");
		
		//starts with
		//driver.findElement(By.xpath("//input[starts-with(@name,'_n')]")).sendKeys("Shirts for kids");
		
		//text
		driver.findElement(By.xpath("//a[text()=' Sell']")).click();
		

		
	}

}
