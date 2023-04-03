package com.osa;

import org.testng.annotations.Test;

public class TC_01Test {

	@Test(groups ="smoke")
	public void TestMethod() {
		System.out.println("Bulid created-------01");
	}
	
	
@Test(groups = "regression")
public void TestMethod2() {
	System.out.println("build created_02-------");
}
}
