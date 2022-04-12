package com.Automatingtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm {
	public WebDriver driver;
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/form/p/button/span")
	private WebElement confirm;
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement signout;
	public WebElement getSignout() {
		return signout;
	}
	public Confirm(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
		
	}
	public WebElement getConfirm() {
		return confirm;
	}

}
