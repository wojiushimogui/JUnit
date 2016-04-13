package com.studyjunit.les1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest2 {

	@Test
	public void testAdd() {
		assertEquals(7, new Calcalate().add(3, 4));
	}

	@Test
	public void testSubtract() {
		assertEquals(2, new Calcalate().subtract(5, 3));
	}

	@Test
	public void testMultiply() {
		assertEquals(12, new Calcalate().multiply(3, 4));
	}

	@Test
	public void testDivide() {
		assertEquals(2,new Calcalate().divide(6, 3));
	}

}
