package com.jenkins.test;

public class HelloJenkins {

	public HelloJenkins() {
		try {
			testJenkins();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testJenkins() throws Exception {
		System.out.println("Hello Jenkins");
	}
	
	public static void main(String[] args) {
		new HelloJenkins();
	}
	
	
}
