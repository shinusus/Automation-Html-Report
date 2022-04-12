package com.Automatingtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sumpropage {
	public WebDriver driver;
	@FindBy(id="selectProductSort")
	private WebElement sortby;
	@FindBy(xpath = "//input[@name='layered_id_attribute_group_2']")
	private WebElement size;
	@FindBy(xpath = "//input[@name='layered_id_attribute_group_14']")
	private WebElement colour;
	@FindBy(id="layered_id_feature_13")
	private WebElement drstype;
	@FindBy(xpath = "//img[@title='Printed Summer Dress']")
	private WebElement selectdrs;
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")
	private WebElement addcart;
	public Sumpropage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSortby() {
		return sortby;
	}
	public WebElement getSize() {
		return size;
	}
	public WebElement getColour() {
		return colour;
	}
	public WebElement getDrstype() {
		return drstype;
	}
	public WebElement getSelectdrs() {
		return selectdrs;
	}
	public WebElement getAddcart() {
		return addcart;
	}

}
