package com.studyjunit.les1;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
/*
 * ��һ�������Ĳ���������ΪRunWith(Parameterized.class) 
 * �ڶ������������������Ԥ��ֵ������ֵ
 * ������������һ������ֵΪCollection�Ĺ�����̬��������ʹ��@Paramter����������
 * ���Ĳ�������һ�����캯������������Ϊ֮����������ֵ
 * ���岽
 * */
@RunWith(Parameterized.class) 
public class ParameterTest {
	private int expected;
	private int input1;
	private int input2;
	@Parameters
	public static Collection<Object[]> t(){
		return Arrays.asList(new Object[][]{
				{5,1,4},
				{8,2,6}
		});
	} 
	public ParameterTest(int expected,int input1,int input2){
		this.expected=expected;
		this.input1=input1;
		this.input2=input2;
	}
	
	@Test
	public void testAdd(){
		assertEquals(expected, new Calcalate().add(input1, input2));
	}
}
