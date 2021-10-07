package com.brouser.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\z003smvy\\eclipse-workspace\\Seleniumtraining\\Driver\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.get("https://www.facebook.com/");
		
		// maximise
		
		web.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement uname = web.findElement(By.xpath("//input[@type='text']"));
		uname.sendKeys("Arv");
		
		WebElement pass = web.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("123");
		
		WebElement nxt = web.findElement(By.xpath("//button[@id='loginbutton'])"));
		nxt.click();
		
		
		
		
	}

}
