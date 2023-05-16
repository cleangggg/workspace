package object;

import java.util.Scanner;

/*
 
  method
    
  - 함수와 메소드는 비슷하다.
  - 어떠한 기능을 가지고 있다면 함수 또는 메소드라고 표현한다.
  - 소괄호가 있으면 대부분 기능이라고 보면된다.
  - 함수는 절차지향언어에서 표현하는 방식이며 메소드는 객체지향 표현 
    
 */

public class MainClass03 {
	public static void main(String[] args) {
		
		System.out.println("main start");
		
		TestClass03 t = new TestClass03();
		t.sumFunc();
		System.out.println("main end");

		
		
		
	}
}
