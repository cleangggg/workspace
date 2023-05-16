package test02;

public class c extends p {

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
