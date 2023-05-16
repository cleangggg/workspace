package while_;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num, sum = 0;
		while (true) {

			System.out.println("10~20 사이의 수입력");
			num = input.nextInt();
			if (num < 10 || num > 20) {
				System.out.println("잘못입력");
				continue;
			} else {
				System.out.println("잘입력");
				break;
			}
		}
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1~" + num + "까지의합:" + sum);

		boolean bool =true;
		int n =1 ;
		while (bool) {//boll =true
			System.out.println("bool종속문장 실행");
			n++;
			if (n==2) {
				//bool =false;
				break;	
			}

			System.out.println("while 종료");
		}
		
	}

}
