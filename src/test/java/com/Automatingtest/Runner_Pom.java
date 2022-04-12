package com.Automatingtest;

import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.Demoautomation.Filereadermanager;

public class Runner_Pom extends Utility_Files {
	public static WebDriver driver=browserlaunch("chrome");
//	public static Homepage hp=new Homepage(driver);
	public static Project_Object_Manager pom=new Project_Object_Manager(driver);
	public static Logger Log= Logger.getLogger(Runner_Pom.class);
	public static void main(String[] args) throws IOException {
		PropertyConfigurator.configure("log4j.properties");
//		geturl("http://automationpractice.com/index.php");
		String url = Filereadermanager.get_instance_Frm().get_instance_cr().config_url();
		geturl(url);
		Log.info("Url Launched");
//		ClickOnElement(hp.getSignin());
		ClickOnElement(pom.getHp().getSignin());
//		inputvalue(pom.getLp().getEmail(),"abcdefzxgfhytr@gmail.com");
//		inputvalue(pom.getLp().getEmail(),getdata("C:\\Users\\Windows\\eclipse-workspace\\Automatingtest\\Test Case Automatinpractice.xlsx"
//				,4,5));
				String email = Filereadermanager.get_instance_Frm().get_instance_cr().get_email();
				inputvalue(pom.getLp().getEmail(), email);
//		inputvalue(pom.getLp().getPassword(),"123456789");
				String password = Filereadermanager.get_instance_Frm().get_instance_cr().get_password();
				inputvalue(pom.getLp().getPassword(), password);
		Log.info("Values entered");
		ClickOnElement(pom.getLp().getSignin());
		Actions(pom.getPp().getWomen(),"move");
		Actions(pom.getPp().getSumdrs(),"move");
		Actions(pom.getPp().getSumdrs(),"click");
		Log.info("Summer drs page launched");
		Actions(pom.getSp().getSortby(),"move");
		dropdown(pom.getSp().getSortby(),"text","In stock");
		implicit();
		ClickOnElement(pom.getSp().getSize());
		ClickOnElement(pom.getSp().getColour());
		ClickOnElement(pom.getSp().getDrstype());
		implicit();
		Actions(pom.getSp().getSelectdrs(),"move");
		Actions(pom.getSp().getAddcart(),"click");
		Log.info("Summary page launched");
		explicitwait(pom.getLc().getCart());
		ClickOnElement(pom.getLc().getCart());
		ClickOnElement(pom.getSc().getCart());
		ClickOnElement(pom.getSpc().getCart());
		ClickOnElement(pom.getAc().getCart());
		ClickOnElement(pom.getSpcr().getCheck());
		ClickOnElement(pom.getSpcr().getCart());
		ClickOnElement(pom.getP().getPay());
		ClickOnElement(pom.getC().getConfirm());
		Log.info("cnfirmation page launched");
	}

}
