package com.Automatingtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addresscart {
	public WebDriver driver;
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/form/p/button/span")
	private WebElement cart;
	public WebElement getCart() {
		return cart;
	}
	public Addresscart(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
		
	}

}
