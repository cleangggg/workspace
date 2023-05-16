package switch_;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);	
		System.out.println("날짜 입력:");
		while(true) {
		int i = input.nextInt();
		switch (i%7) {
		
		
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		case 0:
			System.out.println("일요일");
			break;
	
		
		}
		}
		
	}
	
}
