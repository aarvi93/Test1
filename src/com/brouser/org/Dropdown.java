package com.brouser.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {



		
		public static void main(String[] args) throws InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\z003smvy\\eclipse-workspace\\Seleniumtraining\\Driver\\chromedriver.exe");
			
			WebDriver Bro = (WebDriver) new ChromeDriver();
			Bro.get("https://www.facebook.com/");
			
			WebElement uname = Bro.findElement(By.xpath("//input[@type='text']"));
			uname.sendKeys("Arv");
			
			WebElement pass = Bro.findElement(By.xpath("//input[@type='password']"));
			pass.sendKeys("123");
			
			Thread.sleep(3000);
			
	        WebElement nxt = Bro.findElement(By.xpath("//button[@name='login']"));
			nxt.click();

}
