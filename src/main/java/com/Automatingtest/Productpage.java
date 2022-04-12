package com.Automatingtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;
	@FindBy(xpath = "//a[@title='Summer Dresses']")
	private WebElement sumdrs;
	@FindBy(xpath = "//a[@title='T-shirts']")
	private WebElement tshirts;
	public Productpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getWomen() {
		return women;
	}
	public WebElement getSumdrs() {
		return sumdrs;
	}
	public WebElement getTshirts() {
		return tshirts;
	}

}
