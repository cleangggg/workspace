package set_get;

import java.util.Scanner;

public class MainClassExam {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LoginClass l = new LoginClass();
		l.setId("asdf");
		l.setPwd("asdf");
		
		while(true) {
			System.out.println("======================");
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.종료");
			System.out.println("======================");	
			System.out.println("<<<<");
			int num = input.nextInt();
					
			switch(num) {
			case 1:
				System.out.println("아이디입력:");
				String id = input.next();
				System.out.println("비번입력:");
				String pwd = input.next();
				if (l.getId().equals(id)) {
					if(l.getPwd().equals(pwd)) {
						System.out.println("로그인 성공!!");
					}else {
						System.out.println("비번 다시입력!!");
					}
				}
				
				break;
			case 2:
				System.out.println("회원가입 할 아이디입력:");
				String new_id = input.next();
				System.out.println("비번입력:");
				String new_pwd = input.next();
				if (l.getId().equals(new_id)) {
					
					System.out.println("있는아이디");
				}else {
					l.setId(new_id);
					l.setPwd(new_pwd);
					System.out.println("회원가입완료");
				}
				
				
				
				break;
			case 3:
				System.out.println("종료");
				break;
		
			
			
			}
			
		}
		
		
		
	}
}
