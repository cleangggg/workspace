package object;

public class TestClass07 {

	private void test() {

	}

	public void test01(int num) {
		if (num == 1) {
			System.out.println(111);
			return;
		}
		System.out.println("다음 문장 실행 ");

	}

	public int test02(int n) {
		if (n == 1) {
			System.out.println("test02 222");
			return 200;
		} else if (n == 2) {
			System.out.println("다음 문장 실행");
			return 1;
		} else {
			return 5;
		}
	}

	public boolean test03() {

		System.out.println("s");
		return true;
	}

	public int test04() {
		int num = 1;
		if (num == 1)
			return num;
		return 0;
	}

	public String test05() {
		int num = 1;
		if (num == 1)
			return "Aaa";
		return null;
	}
}
