package exception;

public class MainClass02 {
	public static void main(String[] args) {

		int num = 0;
		while (true) {
			System.out.println("실행");
			try {
				System.out.println(10 / num);
			} catch (Exception e) {
				System.out.println("0 입력하지마세요");
			}
		}
	}

}
