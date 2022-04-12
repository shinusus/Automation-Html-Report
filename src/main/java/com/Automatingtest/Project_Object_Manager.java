package com.Automatingtest;

import org.openqa.selenium.WebDriver;

public class Project_Object_Manager {
	public WebDriver driver;
	private Homepage hp;
	private Loginpage lp;
	private Productpage pp;
	private Sumpropage sp;
	private Lilcart lc;
	private Smallcart sc;
	private Sumprocart spc;
	private Addresscart ac;
	private Shippingcart spcr;
	private Payment p;
	private Confirm c;
	public Confirm getC() {
		if (c==null) {
			c=new Confirm(driver);	
		}
		return c;
	}
	public Payment getP() {
		if (p==null) {
			p=new Payment(driver);	
		}
		return p;
	}
	public Shippingcart getSpcr() {
		if (spcr==null) {
			spcr=new Shippingcart(driver);	
		}
		return spcr;
	}
	public Addresscart getAc() {
		if (ac==null) {
			ac=new Addresscart(driver);	
		}
		return ac;
	}
	public Project_Object_Manager(WebDriver driver2) {
		this.driver=driver2;	
	}
	public Homepage getHp() {
		if (hp==null) {
			hp=new Homepage(driver);
		}
		return hp;
	}
	public Loginpage getLp() {
		if (lp==null) {
			lp=new Loginpage(driver);
		}
		return lp;
	}
	public Productpage getPp() {
		if (pp==null) {
			pp=new Productpage(driver);
		}
		return pp;
	}
	public Sumpropage getSp() {
		if (sp==null) {
			sp=new Sumpropage(driver);
		}
		return sp;
	}
	public Lilcart getLc() {
		if (lc==null) {
			lc=new Lilcart(driver);	
		}
		return lc;
	}
	public Smallcart getSc() {
		if (sc==null) {
			sc=new Smallcart(driver);
			
		}
		return sc;
	}
	public Sumprocart getSpc() {
		if(spc==null) {
			spc=new Sumprocart(driver);
		}
		return spc;
	}

}
