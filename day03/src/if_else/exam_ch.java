package if_else;

import java.util.Scanner;

public class exam_ch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("국어점수 입력:");
		int kor = input.nextInt();
		System.out.println("국어점수 입력:");
		int eng = input.nextInt();
		System.out.println("국어점수 입력:");
		int math = input.nextInt();
		
	
	
		while (true) {
		System.out.println("1.국어점수 2.수학점수 3.영어점수출력");
		int a= 0;
		a = input.nextInt();	
		if (a ==1 ) {
			System.out.println("1.국어"+kor);
		}
		if (a ==2) {
			System.out.println("2.영어"+eng);
		}
		if (a ==3 ) {
			System.out.println("3.수학"+math);
		}
		if (a<=0 || a >3) {
			System.out.println("에러");
		}
		}
	}

}
