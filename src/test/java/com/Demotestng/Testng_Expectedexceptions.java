package com.Demotestng;

import org.testng.annotations.Test;

public class Testng_Expectedexceptions {
	@Test(expectedExceptions = ArithmeticException.class)
	private void sum() {
		int i=5;
		System.out.println(i/0);

	}
	

}
