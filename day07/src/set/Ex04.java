package set;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> tel = new ArrayList<>();
		ArrayList<String> id = new ArrayList<>();
		ArrayList<String> pwd = new ArrayList<>();

		Scanner input = new Scanner(System.in);

		id.add("aaa");
		pwd.add("aaa");

		boolean session = false;

		System.out.println("로그인");
		System.out.println("아이디입력:");
		String id_ = input.next();
		System.out.println("비번입력:");
		String pw_ = input.next();
		for (String n : id) {

			if (n != null) {
				if (n.equals(id_)) {

					for (String p : pwd) {
						if (p.equals(pw_)) {
							System.out.println("로그인 성공");
							session = true;
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

		while (true) {

			if (session) {

				System.out.println("1.연락처 삭제");
				System.out.println("2.모든 연락처 보기");
				System.out.println("3.종료");
				System.out.println(">>>>");
				int num = input.nextInt();

				switch (num) {

				case 1:// 연락처삭제
					System.out.println("삭제할 이름");
					String name_ = input.next();
					for (int i = 0; i < name.size(); i++) {
						if (name.contains(name_)) {
							name.remove(name_);
							System.out.println("삭제완료");

						} else {
							System.out.println("없음");
						}

					}
					break;
				case 2:// 모든 연락처보기
					System.out.println("연락처보기");
					for (int i = 0; i < name.size(); i++) {
						System.out.println("이름: " + name.get(i) + "\t연락처" + tel.get(i));
					}
					break;
				case 3:// 종료
					System.out.println("Good bye");
					System.exit(1);

				}

			}

			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.println(">>>>");
			int num = input.nextInt();

			switch (num) {
			case 1:// 연락처등록
				System.out.println("이름과 연락처 등록");
				String name_ = input.next();
				String tel_ = input.next();

				for (String n : name) {

					System.out.println(n);

					if (!name.contains(name_)) {
						name.add(name_);
						tel.add(tel_);
						System.out.println("등록완료");
						break;
					} else {
						System.out.println("중복");
					}
				}

				break;
			case 2:// 연락처보기
				System.out.println("검색할 이름");
				name_ = input.next();
				for (int i = 0; i < name.size(); i++) {
					if (name.contains(name_)) {
						System.out.println(name.get(i) + tel.get(i));
					} else {
						System.out.println("없음");
					}

				}
				break;
			case 3:// 연락처삭제
				System.out.println("삭제할 이름");
				name_ = input.next();
				for (int i = 0; i < name.size(); i++) {
					if (name.contains(name_)) {
						name.remove(name_);
						System.out.println("삭제완료");

					} else {
						System.out.println("없음");
					}

				}
				break;
			case 4:// 모든 연락처보기
				System.out.println("연락처보기");
				for (int i = 0; i < name.size(); i++) {
					System.out.println("이름: " + name.get(i) + "\t연락처" + tel.get(i));
				}
				break;
			case 5:// 종료
				System.out.println("Good bye");
				System.exit(1);

			}

		}

	}

}
