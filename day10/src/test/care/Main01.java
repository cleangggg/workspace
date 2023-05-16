package test.care;
import java.util.Scanner;

import test.date.Date;
import test.java.*;



public class Main01 {
public static void main(String[] args) {
	
	Test01 t = new Test01();
	t.test();
	
	
	TestClass01 ta = new TestClass01();
	ta.test();
	TestClass02 ta2 = new TestClass02();
	TestClass03 ta3 = new TestClass03();
	Date d1 = new Date();
	test.java.Date d2 = new test.java.Date();
	java.util.Date d3 = new java.util.Date();
	
	d1.data();
	d2.data();
	System.out.println(d3);
	
	
	
	
}
}
