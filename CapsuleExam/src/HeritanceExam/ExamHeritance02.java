package HeritanceExam;

class Car1 {
	Car1() {
		System.out.println("바퀴 핸들");
		System.out.println("이동하기");

	}
}

class Ship1 extends Car1 {
	Ship1() {
		super();
		System.out.println("잠수모드");
		
	}
}

class free extends Car1 {
	free() {
		super();
		System.out.println("자율 주행모드");
		
	}
}

public class ExamHeritance02 {
	public static void main(String[] args) {
		Car1 b = new Ship1();
		System.out.println("===========");
		Car1 b2 = new free();
		

	}

}
