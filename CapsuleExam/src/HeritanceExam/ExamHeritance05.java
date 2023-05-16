package HeritanceExam;

class Kaden {
	Kaden() {

		System.out.println("전원on");
		System.out.println("전원off");

	}
}

class gongi extends Kaden {
	gongi() {
		super();
		System.out.println("냄새제거");
		System.out.println("바람세기조절");

	}
}

class dry extends Kaden {
	dry() {
		super();

		System.out.println("온도조절");
		System.out.println("바람세기조절");

	}
}

class notebook extends Kaden {
	notebook() {
		super();
		System.out.println("로그인");
		System.out.println("로그아웃");

	}
}

public class ExamHeritance05 {
	public static void main(String[] args) {
		Kaden b = new gongi();
		System.out.println("===========");
		Kaden b2 = new notebook();
		System.out.println("===========");
		Kaden b3 = new dry();

	}

}
