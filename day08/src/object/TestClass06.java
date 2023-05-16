package object;

import java.util.Scanner;

public class TestClass06 {
	int n1 , n2 ,sum;
	public int[] myIput() {
		Scanner input = new Scanner(System.in);
		int n1 ,n2,sum;
		System.out.println("수입력:");
		n1 = input.nextInt();
		System.out.println("수입력:");
		n2 = input.nextInt();
		int [] arr = {n1,n2};
		return arr;
	}
	
	public int Sum(int[] arr) {
				
		sum = arr[0]+arr[1];
		return sum;
		
	}
	public void print(int n) {
		System.out.println(n);
		
	}
}
