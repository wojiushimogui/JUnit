package com.studyjunit.les1;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//����һ���׼����׼��������Ϊ��
@RunWith(Suite.class)  //���Ĳ���������
//��������Ǽ������еĲ����࣬���������ʽ����
@Suite.SuiteClasses({CalculateTest.class,CalculateTest2.class,CalculateTest3.class,AnonationTest.class})
public class SuiteTest {

}
