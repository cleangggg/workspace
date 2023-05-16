package map;

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {

		HashMap<String, Integer> menu = new HashMap<>();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("1.메뉴등록");
			System.out.println("2.메뉴별 가격보기");
			System.out.println("3.종 료");
			System.out.println(">>>");
			int num = input.nextInt();

			switch (num) {
			case 1:
				System.out.println("등록할메뉴입력:");
				String menu_ = input.next();
				System.out.println("메뉴 가격입력");
				int price = input.nextInt();
				menu.put(menu_, price);
				System.out.println("등록완료");

				break;
			case 2:
				Iterator<String> it = menu.keySet().iterator();
				Iterator<Integer> it2 = menu.values().iterator();
				while (it.hasNext()) {
					String key = it.next();
					System.out.println(key + " : " + menu.get(key));
				}
				System.out.println("1.수정 2.삭제 3.나가기");
				num = input.nextInt();
				switch (num) {
				case 1:
					System.out.println("메뉴검색 ");
					menu_ = input.next();
					if (menu.containsKey(menu_)) {
						System.out.println("수정할 가격 입력");
						price = input.nextInt();
						menu.put(menu_, price);
						break;
					}
				case 2:
					System.out.println("메뉴검색 ");
					menu_ = input.next();
					if (menu.containsKey(menu_)) {
						menu.remove(menu_);
						System.out.println("삭제완료 ");
						break;
					}

				case 3:
					System.out.println("Good bye");
					System.exit(1);
					break;

				}
				break;
			case 3:

				break;

			}

		}

	}
}
