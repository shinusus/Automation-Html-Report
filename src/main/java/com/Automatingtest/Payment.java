package com.Automatingtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	public WebDriver driver;
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a/span")
	private WebElement pay;
	public Payment(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
		
	}
	public WebElement getPay() {
		return pay;
	}

}
