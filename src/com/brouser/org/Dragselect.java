package com.brouser.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragselect {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\z003smvy\\eclipse-workspace\\Seleniumtraining\\Driver\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.myntra.com/");
		
		Driver.manage().window().maximize();
		//men
		
		Actions a = new Actions(Driver);
		
		
		WebElement Men = Driver.findElement(By.xpath("//a[@data-group='men']"));
		
		a.moveToElement(Men).build().perform();
		
		Thread.sleep(3000);
		
		WebElement sports = Driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/div/div/div/li[4]/ul/li[2]/a"));
		
		a.click(sports).build().perform();
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		
		Driver.quit();
		
		
		
	
	

}
}
