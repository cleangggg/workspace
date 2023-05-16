package if_;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int coffee_cnt = 0;
		int coffee = 2000;
		System.out.println("커피몇개사실 ??");
		coffee_cnt = input.nextInt();
				
		if (coffee_cnt >10) {
			int coffee_max = coffee*10;
			coffee= 1500;
			System.out.println((coffee*(coffee_cnt-10)+coffee_max));
		}else {
			System.out.println("커피가격:"+coffee*coffee_cnt);
		}
		
	}
}
