package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open chrome browser
				System.setProperty("webdriver.chrome.driver", "D://Selenium//Chromedrive//chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				//max the chrome browser
				driver.manage().window().maximize();
				
				//navigate to the url
				driver.get("http://automationpractice.com/index.php");
				System.out.println(driver.getTitle());
				
				//[by LinkedTest
				//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
				
				//[by Partial LinkTest]
				driver.findElement(By.partialLinkText("Printed Chiffon Dress")).click();
	}

}
