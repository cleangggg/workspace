package inheritance;

class p {

	p() {
		System.out.print("A");
	}

	p(int a) {
		System.out.print("B");
	}
}

class c extends p {

	c() {
		System.out.println("C");
	}

	c(int a) {
		System.out.println("D");
	}

	c(int a, int b) {
		super(a);
		System.out.print("E");
	}
}

public class TestExam01 {

	public static void main(String[] args) {

		p p1 = new c();
		System.out.println();
		p p2 = new c(1);
		System.out.println();
		p p3 = new c(1, 2);
		

	}

}
