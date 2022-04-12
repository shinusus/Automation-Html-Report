package com.Automatingtest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Demoautomation.Filereadermanager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Test_Runner extends Utility_Files {
		public static WebDriver driver=browserlaunch("chrome");
//		public static Homepage hp=new Homepage(driver);
		public static Project_Object_Manager pom=new Project_Object_Manager(driver);
		public static Logger Log= Logger.getLogger(Runner_Pom.class);
		public static ExtentReports reports;
		public static ExtentTest test;
		public static ExtentSparkReporter sparkreporter;
		@Test
		private void summerdrs() {
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

		}
		@BeforeMethod
		private void signin() {
			PropertyConfigurator.configure("log4j.properties");
			geturl("http://automationpractice.com/index.php");
			Log.info("Url Launched");
			ClickOnElement(pom.getHp().getSignin());
			inputvalue(pom.getLp().getEmail(),"abcdefzxgfhytr@gmail.com");
			inputvalue(pom.getLp().getPassword(),"123456789");
			Log.info("Values entered");
			ClickOnElement(pom.getLp().getSignin());
			
		}
		@AfterMethod
			private void signout() {
				Log.info("confirmation page launched");
				ClickOnElement(pom.getC().getSignout());

			}
		@BeforeTest
		private void report_generate() {
			sparkreporter=new ExtentSparkReporter("C:\\Users\\Windows\\eclipse-workspace\\Automatingtest\\Reports");
			reports=new ExtentReports();
			reports.attachReporter(sparkreporter);
		}
		@AfterTest
		private void flush() {
			reports.flush();
		}
			@Test
			private void tshirts() {
				Actions(pom.getPp().getWomen(),"move");
				Actions(pom.getPp().getTshirts(),"move");
				Actions(pom.getPp().getTshirts(), "click");
//				javascript(pom.getSpc().getImage());
				Actions(pom.getSpc().getImage(),"move");
				Actions(pom.getSpc().getImage(),"click");
				Actions(pom.getSpc().getCart1(),"click");
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




