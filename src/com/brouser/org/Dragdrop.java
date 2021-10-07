package com.brouser.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dragdrop {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\z003smvy\\eclipse-workspace\\Seleniumtraining\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.id("draggable"));
		
		
		

}
}
