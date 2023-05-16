package variable;

import java.util.Scanner;

public class TestClassExam {
	
	public void display() {
		Scanner input = new Scanner(System.in);
		System.out.println("이름입력:");
		String name = input.next();
		System.out.println("나이 입력:");
		int age = input.nextInt();
		System.out.println("이름 :" +name);
		age -=1;
		System.out.println("만 나이: " +age );
	}
	
	private String name;
	private int age;
	private int a_age;
	Scanner input = new Scanner(System.in);
	public String nameInput() {
		System.out.println("이름입력:");
		name = input.next();		
		return name;
	}
	public int ageInput() {
		System.out.println("나이:");
		int age = input.nextInt();
		return age; 
	}
	
	public int age(int age) {
		age -= 1;
		return age;
	}
	
	
}
