package object;

import java.util.Scanner;

public class TestClassExam {
	Scanner input = new Scanner(System.in);

	public String Input() {
		System.out.println("문자입력");
		String a = input.next();
		return a;
	}

	public void Output(Object a) {
		System.out.println(a);
	}

	public int Input2() {
		System.out.println("정수입력");
		int a = input.nextInt();
		return a;

	}

	public void exam1(int a) {
		if (a % 2 == 0) {
			System.out.println("짝");

		} else {
			System.out.println("홀");
		}

	}

	public void exam2(int a) {
		if (a % 3 == 0) {
			System.out.println("3의배수");

		} else {
			System.out.println("3의배수아님");
		}
	}

	public void exam3(int a) {
		boolean b = false;
		for (int i = 0; i < a - 1; i++) {
			if (i % a != 0) {
				break;
			}else {
				b=true;
			}
		}
		if (b) {
			System.out.println("소수 ");
		} else {
			System.out.println("소수아님");
		}
	}

	public void exam4(int a) {
		if (a > 0) {
			System.out.println("절대값은" + a);
		} else if (a < 0) {
			System.out.println("절대값은 " + (-a));
		} else {
			System.out.println("잘못입력");
		}

	}

}
