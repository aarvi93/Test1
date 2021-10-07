package com.brouser.org;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class test {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\z003smvy\\eclipse-workspace\\Seleniumtraining\\Driver\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.get("https://www.facebook.com/");
		
		// maximise
		
		web.manage().window().maximize();
		Thread.sleep(3000);
		
		
		//Dimension size = new Dimension(300,400);
		
		//Thread.sleep(3000);
		
		//Point position = new Point(300,400);
		
		
		//String currenturl = web.getCurrentUrl();
		//System.out.println("URL:"+currenturl);
		
		//web.navigate().back();
		
		//WebElement username = web.findElement(By.id("email"));
		//username.sendKeys("Arv");
		//WebElement pass = web.findElement(By.id("pass"));
		//pass.sendKeys("12345678");
		//WebElement login = web.findElement(By.name("login"));
		//login.click();
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
