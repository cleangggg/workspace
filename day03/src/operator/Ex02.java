package operator;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	
		int su =8;
		String s = (su%2 ==0)? "짝수":"홀수";
		System.out.println(su +""+s);
		
		int a ,b,c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("a입력:");
		a=input.nextInt();
		System.out.println((a%2==0)?"짝수다":"아니다");	
		System.out.println((a%3==0)?"3의배수":"아니다");	
		System.out.println("두수입력:");
		b=input.nextInt();
		c=input.nextInt();
				
		System.out.println((b>c)?"더큰수는"+b:"더큰수는"+c);
		
	}
	
}
