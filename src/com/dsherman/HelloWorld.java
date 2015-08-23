package com.dsherman;

public class HelloWorld {

	public static final String GREETING = "Hello, ";
	private static final String DEFAULT_NAME = "World";

	public String greet() {
		return greet(DEFAULT_NAME);
	}

	public String greet(String name) {
		return GREETING + name;
	}

}
