package com.Automatingtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retryanalyzer {
	@Test(retryAnalyzer = Retry_Class.class)  //retry analyzer feature of Testng is used and implementation of I retry analyzer
	   // in seperate Retry_class is given here
	private void username(){
		String exp_name="starc";
		String act_name="starc123";
		Assert.assertEquals(act_name,exp_name);
}
	@Test
	private void password(){
		String exp_name="smith123";
		String act_name="smith123";
		Assert.assertEquals(act_name,exp_name);
		}



}
