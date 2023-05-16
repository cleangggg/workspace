package overriding;

final class A04 { //상속을 받을수 없다
	public void test() {
		System.out.println("부모 메소드");
	}

}

class B04  {
	A04 a = new A04();
	String s ;
	public void test() {
		a.test();
		System.out.println("자식 메소드");
	}

}

public final class MainClass04 {
	public static void main(String[] args) {
		B04 b = new B04();
		b.test();
	}
}
