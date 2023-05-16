package HeritanceExam;

class Animal {
	Animal() {
		System.out.println("먹는행동");
		System.out.println("자는행동");
		System.out.println("달리는행동");

	}
}

class Dog extends Animal {
	Dog() {
		super();
		System.out.println("짖기" );
		System.out.println("물기" );
		
	}
}

class Cat  extends Animal {
	Cat() {
		super();
		System.out.println("할퀴기");
		System.out.println("점프");
		
	}
}
class Ko  extends Animal {
	Ko() {
		super();
		System.out.println("들이받기");
		
		
	}
}

public class ExamHeritance03 {
	public static void main(String[] args) {
		Animal b = new Ko();
		System.out.println("===========");
		Animal b2 = new Cat();
		System.out.println("===========");
		Animal b3 = new Dog();
		

	}

}


