package com.Automatingtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lilcart {
	public WebDriver driver;
	@FindBy(id="thumb_15")
	private WebElement choose;
	@FindBy(xpath="//select[@name='group_1']")
	private WebElement sizechange;
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button")
	private WebElement cart;
	public Lilcart(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCart() {
		return cart;
	}
	public WebElement getChoose() {
		return choose;
	}
	public WebElement getSizechange() {
		return sizechange;
	}
}
