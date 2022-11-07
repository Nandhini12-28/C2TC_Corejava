package com.testingdocs.sample.Questions;

public class SystemInfoDemo {

	public static void main(String[] args) {
		System.out.println("Java Version = "+ javaVersion());
	}
	public static String javaVersion() {
		return System.getProperty("java.version");
		
	}

}
