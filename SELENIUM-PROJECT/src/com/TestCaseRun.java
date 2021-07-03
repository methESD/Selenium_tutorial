package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open chrome browser
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Chromedrive//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
   
		//max the chrome browser
		driver.manage().window().maximize();
		
		//navigate to the url
		driver.get("https://opensource-demo.orangehrmlive.com/");
				
		//enter valid username
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//enter valid password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//click on login 
		driver.findElement(By.id("btnLogin")).click();
		
	    //get current URL
		String act_url = driver.getCurrentUrl();
		System.out.println(act_url);
		
		//verify the URL
		String desired_url ="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		if(act_url.equals(desired_url))
		{
			System.out.println("Pass");
		}else {
			
			System.out.println("Fail");
		}
		
		//get title
		String act_title = driver.getTitle();
		System.out.println(act_title);
		
		//verify title
		String drsired_title ="OrangeHRM";
		if(act_title.equals(drsired_title))
		{
			System.out.println("Pass");
		}else {
			
			System.out.println("Fail");
		}
		
		//get pageSource
		String ps=driver.getPageSource();
		System.out.println(ps);
		
		//close the browser
		driver.close();

		
	}

}
