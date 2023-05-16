package switch_;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String myHome = null;
	String myWork = null;
		while (true) {
			
			int i=0 ;
			
			System.out.println("1.우리집등록 2.회사등록 3.등록보기");
			i=input.nextInt();
			switch(i) {
			case 1:
				System.out.println("우리집 등록:");
				myHome = input.next();
				break;
			case 2:
				System.out.println("회사등록:");
				 myWork = input.next();
				break;
			case 3:
				System.out.println("우리집"+myHome);
				System.out.println("회사"+myWork);
			
			}
			
		}
	
	
	}
}
