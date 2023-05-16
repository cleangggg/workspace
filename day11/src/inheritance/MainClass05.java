package inheritance;

class A05 {
	public A05(int num) {
		System.out.println(num + ": 부모생성자");
	}
}
class B05 extends A05{

	public B05(int num) {
		super(num);
		System.out.println(num + ": 자식생성자 ");
	}
}

public class MainClass05 {
	public static void main(String[] args) {
		//A05 a = new A05(100);
		B05 b = new B05(200);
		A05 c = new B05(200);
	}
}
