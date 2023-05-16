package array;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] id = new String[3];
		String[] pwd = new String[3];
		int index = 0;
		while (true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.나가기");
			System.out.println("4.회원전체보기");
			System.out.println("5.특정회원보기");
			System.out.println("6.특정회원 비번수정");
			System.out.println("7.특정회원 삭제");
			int num = input.nextInt();
			System.out.println("============");
			switch (num) {
			case 1:
				String id_ = null;
				String pw_ = null;
				System.out.println("로그인");
				System.out.println("아이디입력:");
				id_ = input.next();
				System.out.println("비번입력:");
				pw_ = input.next();
				for (String n : id) {

					if (n != null) {
						if (n.equals(id_)) {

							for (String p : pwd) {
								if (p.equals(pw_)) {
									System.out.println("로그인 성공");
									break;
								} else {
									System.out.println("비번틀림");
									break;
								}

							}
						}
					}
					if (true) {
						System.out.println("회원가입하세요");
						break;
					}

				}
				break;
			case 2:

				System.out.println("회원가입");
				System.out.println("아이디입력:");
				String id_new = input.next();
				System.out.println("비번입력:");
				String pw_new = input.next();

				if (id[2] != null) {
					System.out.println("용량초과");
					break;
				}

				for (String w : id) {

					if (w == id_new) {
						System.out.println("아이디있음");
						break;
					} else {

						if (id[index] != null) {
							index++;
						}

						id[index] = id_new;
						pwd[index] = pw_new;
						System.out.println("회원가입축하");
						break;

					}

				}

				break;

			case 3:
				System.out.println("Good bye");
				System.exit(1);

			case 4:
				for (int i = 0; i < id.length; i++) {
					System.out.println("아이디" + id[i] + "비번" + pwd[i]);

				}
				break;
			case 5:
				System.out.println("회원검색 아이디입력 ");
				String cur_id = input.next();
				for (String c : id) {
					if (cur_id.equals(c)) {
						System.out.println("welcome "+c);
						break;
					}
				}break;
			case 6:
				System.out.println("회원검색 아이디입력 ");
				cur_id = input.next();
				for (int i = 0; i < id.length; i++) {
					if (cur_id.equals(id[i])) {
						System.out.println("비번입력:");
						String cur_pwd = input.next();
						if (cur_pwd.equals(pwd[i])) {
							System.out.println("수정할 비번 입력");
							String cha_pwd = input.next();
							System.out.println("비번 확인");
							String cha2_pwd = input.next();
							if (cha_pwd.equals(cha2_pwd)) {
								System.out.println(pwd[i]);
								pwd[i] = cha2_pwd;
								System.out.println("비번수정완료");
								break;
							}
						}
					}
				}break;
			case 7:
				System.out.println("회원검색 아이디입력 ");
				cur_id = input.next();
				for (int i = 0; i < id.length; i++) {
					if (cur_id.equals(id[i])) {
						System.out.println("삭제 할거면 비번입력:");
						String cur_pwd = input.next();
						if (cur_pwd.equals(pwd[i])) {
							id[i] = null;
							pwd[i] = null;
							System.out.println("Bye~~");
							break;
						}
					}

				}break;

			default:
				System.out.println("에러");
				continue;
			}
		}

	}
}