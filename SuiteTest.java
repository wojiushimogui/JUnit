package com.studyjunit.les1;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//定义一个套件，套件里面必须为空
@RunWith(Suite.class)  //更改测试运行器
//下面这个是加载运行的测试类，用数组的形式给出
@Suite.SuiteClasses({CalculateTest.class,CalculateTest2.class,CalculateTest3.class,AnonationTest.class})
public class SuiteTest {

}
