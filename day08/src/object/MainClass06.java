package object;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		
		TestClass06 t = new TestClass06();
		System.out.println( t );
		int arr[] = t.myIput();		
		int a =t.Sum(arr);
		t.print(a);
	}
}
