package com.dsherman;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
	
	HelloWorld greeter = null;
	
	@Before
	public void setUp() {
		greeter = new HelloWorld();
	}

	@Test
	public void test() {
		assertNotNull(greeter);
	}
	
	@Test
	public void expectGreeting() {
		String rcvd = greeter.greet();
		String expect = HelloWorld.GREETING + "World";
		assertEquals("expect correct greeting", expect, rcvd);
	}
	
	@Test
	public void expectPersonalGreeting() {
		String rcvd = greeter.greet("Dennis");
		String expect = HelloWorld.GREETING + "Dennis";
		assertEquals("expect personal greeting", expect, rcvd);
	}

}
