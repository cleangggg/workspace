package str;

import java.util.*;

public class Stringexam01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("문자입력");
		String a = input.nextLine();
		String blank = " ";
		ArrayList<String> arr = new ArrayList<>();
		int cnta = 0;
		int cntg = 0;
		int cntall = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'a') {
				System.out.println(i + 1);
				cnta++;
			} else if (a.charAt(i) == 'g') {
				cntg++;
			}
			cntall++;
		}

		System.out.println("a의계수:" + cnta);
		System.out.println("g의계수:" + cntg);
		System.out.println("전체의계수:" + cntall);

	}
}
