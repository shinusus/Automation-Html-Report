package com.Automatingtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Runnercls extends Utility_Files {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = browserlaunch("chrome");
		geturl("http://automationpractice.com/index.php");
		WebElement signin = driver.findElement(By.className("login"));
		ClickOnElement(signin);
		WebElement email = driver.findElement(By.id("email"));
		inputvalue(email, "abcdefzxgfhytr@gmail.com");
		WebElement passwrd = driver.findElement(By.id("passwd"));
		inputvalue(passwrd, "123456789");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		ClickOnElement(login);
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions(women,"move");
		WebElement csldrs = driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
		Actions(csldrs,"move");
		Actions(csldrs,"click");
		WebElement img = driver.findElement(By.xpath("//img[@alt='Printed Dress']"));
		Actions(img,"move");
		WebElement cart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
		ClickOnElement(cart);
//		WebElement prdcart = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
//		ClickOnElement(prdcart);
		
		
	}

}
