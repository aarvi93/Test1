package com.brouser.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multidropdown {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\z003smvy\\eclipse-workspace\\Seleniumtraining\\Driver\\chromedriver.exe");
		
		WebDriver Bro = new ChromeDriver();
		Bro.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		//maximize
		
		Bro.manage().window().maximize();
		
		//is multiple 
		
		WebElement all_options = Bro.findElement(By.id("multi-select"));
		
		
		Select s= new Select(all_options);
		
		s.isMultiple();
		
		
		
		
		
		
		
		
	}

}
 