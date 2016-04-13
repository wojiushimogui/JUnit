package com.studyjunit.les1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest3 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this is beforeClass...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is afterClass...");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is before...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is after...");
	}

	@Test
	public void test1() {
		System.out.println("this is a test 1...");
	}
	@Test
	public void test2() {
		System.out.println("this is a test 2...");
	}
}

/*
 * 运行结果如下：
 * this is beforeClass...
   this is before...
   this is a test 1...
   this is after...
   this is before...
   this is a test 2...
   this is after...
   this is afterClass...
 * 
 * 从结果可以得到Junit运行流程如下：
 * 1、@BeforeClass修饰的方法会在所有方法被调用前被执行，而且由于此方法是静态的，因此当测试类被加载后接着就会运行它
 * ，且只会运行一次，内存中只会存在一份实例，比较适合于对配置文件的加载等。
 * 2、@AfterClass修饰的方法会在所有方法被调用后被执行，
 * 也只会执行一次，比较适合用于资源的清理操作。如：关闭数据库的连接。
 * 3、@Before和@After在每个@Test方法前后各执行一次。
 * */
