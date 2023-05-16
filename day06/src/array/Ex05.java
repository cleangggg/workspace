package array;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = { 12, 54, 12, 17, 25, 30 };
		System.out.println("짝수 ,홀수입력");
		String a = input.next();
		for (int n : arr) {
			if (a.equals("짝수")) {
				if (n % 2 == 0) {
					System.out.println("짝수: " + n);
					
				} 
			}else if (a.equals("홀수")) {
				if (n % 2 == 1) {
					System.out.println("홀수: " + n);
					
				}
			}else {
				System.out.println("잘못입력");
			}
		}
	}
}