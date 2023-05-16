package constructor;

import java.util.Scanner;

public class TempMain {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	TempService t = new TempService();
	int temp =10;
	while(true) {
		
		System.out.println("1.온도올리기");
		System.out.println("2.온도내리기");
		System.out.println("3.현재 설정 정보");
		int num = input.nextInt();
		switch(num) {
		case 1:
			System.out.println("올리기");
			t.up(temp++);
			break;
		case 2:
			System.out.println("내리기");
			t.down(temp--);
			break;
		case 3:
			System.out.println("현재온도: "+t.config());
			break;
		
		}
		
		
	}
	
	
}
}