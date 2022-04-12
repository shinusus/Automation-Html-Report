package com.Automatingtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shippingcart {
	public WebDriver driver;
	@FindBy(id = "cgv")
	private WebElement check;
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span")
	private WebElement cart;
	public Shippingcart(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
		
	}
	public WebElement getCheck() {
		return check;
	}

	public WebElement getCart() {
		return cart;
	}

}
