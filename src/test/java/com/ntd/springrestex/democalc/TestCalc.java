package com.ntd.springrestex.democalc;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		assertEquals(10, c.add(5, 5));
	}

	@Test
	public void testMult() {
		Calculator c = new Calculator();
		assertEquals(25, c.multiply(5, 5));
	}	
	
	@Test
	public void testSub() {
		Calculator c = new Calculator();
		assertEquals(10, c.subtract(20, 10));
	}	
		
}
