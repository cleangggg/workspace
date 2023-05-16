package variable;

import java.util.Scanner;

public class TestClassExam02 {

	private String name, grade;
	private int kor, eng, math, sum;
	private double avg;

	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("이름입력:");
		name = input.next();
		System.out.println("국영수 입력:");
		System.out.println("국어:");
		kor = input.nextInt();
		System.out.println("수학:");
		math = input.nextInt();
		System.out.println("영어:");
		eng = input.nextInt();

	}

	public int Sum() {
		sum = kor + math + eng;

		return sum;
	}

	public double Avg() {

		avg = sum / 3;

		return avg;
		

	}

	public void Grade() {
		int i_avg = (int) avg;
		switch (i_avg / 10) {
		case 10:
		case 9:
			grade= "A";
			break;
		case 8:
			grade= "B";
			break;
		default:
			grade= "C";
			break;
		}
	}

	public void Put() {
		System.out.printf("이름"+name+"국영수"+kor+math+eng+"합계: "+sum
				+ "평균: "+avg+ "등급: "+grade);
	}

}
