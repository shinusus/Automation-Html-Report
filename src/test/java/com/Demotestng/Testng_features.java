package com.Demotestng;

import org.testng.annotations.Test;

public class Testng_features {
	@Test(groups = "Movies",priority = -1)
	private void harrypotter() {
		System.out.println("Harry potter");

	}
	@Test(enabled=false,groups = "Movies", priority = 0)
	private void Narnia() {
		System.out.println("Narnia");

	}
	@Test(groups = "Movies",priority = -2)
	private void fantasticfour() {
		System.out.println("Fantastic four");

	}
	@Test(groups = "Cars",priority = -2)
	private void Renault() {
		System.out.println("Renault");

	}
	@Test(groups = "Cars",priority = -1)
	private void Tata() {
		System.out.println("Tata");

	}
	@Test(groups = "Cars",priority = 0)
	private void Kia() {
		System.out.println("Kia");

	}
	@Test(groups = "Bikes",invocationCount = 2)
	private void yamaha() {
		System.out.println("Yamaha");

	}

}
