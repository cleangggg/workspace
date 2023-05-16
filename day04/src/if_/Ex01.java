package if_;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("수를 입력받아 0보다 크고 100보다 작으면 정상, 아니면 비정상 출력");
		int a = input.nextInt();
		if (0<a && a<100) {
			System.out.println("정상");
		}
		else {
			
		}
	}
	
	
}
