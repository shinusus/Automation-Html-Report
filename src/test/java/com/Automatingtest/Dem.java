package com.Automatingtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dem {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\eclipse-workspace\\Automatingtest\\drivr\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.navigate().to("http://automationpractice.com/index.php");
		WebElement element = driver.findElement(By.xpath("//a[@class='logout']"));
		element.click();
		Actions act=new Actions(driver);
		act.click(element);
		
	}

}
