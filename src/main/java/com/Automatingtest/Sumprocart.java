package com.Automatingtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sumprocart {
	public WebDriver driver;
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")
	private WebElement cart;
	@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement image;
	@FindBy(xpath = "//button[@name='Submit']")
	private WebElement cart1;
	public WebElement getCart1() {
		return cart1;
	}
	public WebElement getImage() {
		return image;
	}
	public Sumprocart(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
		
	}
	public WebElement getCart() {
		return cart;
	}
	

}
