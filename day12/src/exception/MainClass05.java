package exception;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		int age = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("나이입력");
		try {
			age = input.nextInt();
			if (age < 1) {
				throw new Exception("잘못입력");

			}
			System.out.println(age);
		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}
}
