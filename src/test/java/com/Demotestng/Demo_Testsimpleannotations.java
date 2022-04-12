package com.Demotestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_Testsimpleannotations {
	@Test
	private void women() {
		System.out.println("women");

	}
	@Test
	private void tshirts() {
		System.out.println("tshirts");

	}
	@Test
	private void summerdrs() {
		System.out.println("summer dress");

	}
	@BeforeSuite
	private void launch_browser() {
		System.out.println("browser launch");

	}
	@BeforeTest
	private void url() {
		System.out.println("url launch");

	}
	@BeforeClass
	private void maximize() {
		System.out.println("maximize window");

	}
	@BeforeMethod
	private void signin() {
		System.out.println("signin");

	}
	@AfterMethod
	private void signout() {
		System.out.println("signout");

	}
	@AfterClass
	private void refresh() {
		System.out.println("refresh");

	}
	@AfterTest
	private void close() {
		System.out.println("close tab");

	}
	@AfterSuite
	private void deletecookies() {
		System.out.println("delete all cookies");

	}

}
