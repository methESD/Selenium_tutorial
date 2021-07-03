package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Chromedrive//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//navigate to url
		driver.get("https://primed-admin.netlify.app/login");
		System.out.println(driver.getTitle());
		
		//close the brouwser
		driver.close();
		
		
	



	}

}
