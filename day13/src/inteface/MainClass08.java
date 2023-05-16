package inteface;

import java.util.Scanner;

public class MainClass08 {
	public static void main(String[] args) {
		//A08지상군 a = new A08지상군();
		//B08공군 b = new B08공군();
		
		Unit08 unit = null;
		
		Scanner input = new Scanner(System.in);

		System.out.println("적이 쳐들어 왔습니다.");
		System.out.println("1. 지상군 2.공군");
		int num = input.nextInt();
		if (num == 1) {
			unit = new A08지상군();
			System.out.println("지상군 선택");
		} else {
			unit = new B08공군();
			System.out.println("공군 선택");
		}

		System.out.println("1.공격 2.방어");
		int choice = input.nextInt();
		if (choice == 1) {
			unit.attack();
		} else {
			unit.defense();
		}


	}
}
