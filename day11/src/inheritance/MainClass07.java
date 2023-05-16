package inheritance;

class A07 {
	public void test() {
		System.out.println("부모 test실행");
	}

}

class B07 extends A07 {
	public void bbb() {
		System.out.println("자식 bbb실행");
		super.test();
		this.test();
		
	}
	public void test() {
		System.out.println("자식 test실행");
	}

}

public class MainClass07 {
	public static void main(String[] args) {
		B07 b = new B07();
		b.bbb();
		//b.test();
		
		
	}
}
