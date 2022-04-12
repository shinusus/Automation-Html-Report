package com.Automatingtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Smallcart {
	public WebDriver driver;
	@FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")
	private WebElement cart;
	public Smallcart(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}
	public WebElement getCart() {
		return cart;
	}

}
