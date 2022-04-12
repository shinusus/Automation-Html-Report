package com.Automatingtest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Class implements IRetryAnalyzer {
							//implementation of IRetryAnalyzer Interface is done here
		int start=1;					//Retrying of failed tests starting is given as 1 
		int end=3;					//Retrying of failed tests ending is given as 3
	//override method
		@Override
	public boolean retry(ITestResult result){	//In ITestResult result, it has the test result
		if(start<=end){				// Here it checks the condition
		start++;				// Iteration given for start
		return true; 				// start to retry
	}
		return false; 		
	}
}
	
