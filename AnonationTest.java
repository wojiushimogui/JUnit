package com.studyjunit.les1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnonationTest {
	@Test
	@Ignore
	public void testDivide() {
		assertEquals(2, new Calcalate().divide(4, 0));
	}
	@Test(expected=ArithmeticException.class)
	public void testDivide1(){
		assertEquals(2, new Calcalate().divide(4, 0));
	}
	@Test(timeout=4000)
	@Ignore
	public void testWhile(){
		while(true){
			System.out.println("run always..");
		}
	}
}
