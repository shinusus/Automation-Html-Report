package com.Automatingtest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Iannotation implements IAnnotationTransformer{
	public void transform(ITestAnnotation annotation, Class testclass, Constructor testconstructor,Method testmethod) {
		annotation.setRetryAnalyzer(Retry_Class.class);
	}

}
