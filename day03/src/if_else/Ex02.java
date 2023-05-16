package if_else;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		if (a<0) {
			a *= -1;
		
	}
			System.out.println(a);
	}
}
