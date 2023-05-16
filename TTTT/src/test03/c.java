package test03;

public class c extends p {
	c() {
		System.out.print("C");
	}

	c(int a) {
		System.out.print("D");
	}

	c(int a, int b) {
		super(a);
		System.out.print("E");

	}
}
