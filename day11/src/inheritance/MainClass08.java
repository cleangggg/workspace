package inheritance;

class A08 {
	public void a() {
		System.out.println("aaa");
	}
}

class B08 extends A08 {
	public void b() {
		System.out.println("bbb");
	}
	public void a() {
		System.out.println("Bababa");
	}
}

class C08 extends B08 {
	public void c() {
		System.out.println("ccc");
	}
	public void a() {
		System.out.println("Cacacaca");
	}
}

public class MainClass08 {
	public static void main(String[] args) {
		C08 c = new C08();
//		c.a();
//		c.b();
//		c.c();
		A08 ac = new C08();
		A08 ab = new B08();
		A08 aa = new A08();
		aa.a();
		ac.a();
		ab.a();
	}

}
