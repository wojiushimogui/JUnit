package com.studyjunit.les1;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
/*
 * 第一步：更改测试运行器为RunWith(Parameterized.class) 
 * 第二步：声明变量来存放预期值和输入值
 * 第三步：声明一个返回值为Collection的公共静态方法，并使用@Paramter来进行修饰
 * 第四步：声明一个构造函数，并在其中为之声明变量赋值
 * 第五步
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
