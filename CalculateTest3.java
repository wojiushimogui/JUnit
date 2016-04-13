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
 * ���н�����£�
 * this is beforeClass...
   this is before...
   this is a test 1...
   this is after...
   this is before...
   this is a test 2...
   this is after...
   this is afterClass...
 * 
 * �ӽ�����Եõ�Junit�����������£�
 * 1��@BeforeClass���εķ����������з���������ǰ��ִ�У��������ڴ˷����Ǿ�̬�ģ���˵������౻���غ���žͻ�������
 * ����ֻ������һ�Σ��ڴ���ֻ�����һ��ʵ�����Ƚ��ʺ��ڶ������ļ��ļ��صȡ�
 * 2��@AfterClass���εķ����������з��������ú�ִ�У�
 * Ҳֻ��ִ��һ�Σ��Ƚ��ʺ�������Դ������������磺�ر����ݿ�����ӡ�
 * 3��@Before��@After��ÿ��@Test����ǰ���ִ��һ�Ρ�
 * */
