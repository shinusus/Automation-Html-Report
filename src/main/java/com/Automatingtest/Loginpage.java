package com.Automatingtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver driver;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="passwd")
	private WebElement password;
	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
	private WebElement signin;
	public Loginpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSignin() {
		return signin;
	}

}
