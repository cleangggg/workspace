package HeritanceExam;

class Cellphone {
	Cellphone() {
		System.out.println("제품번호");
		System.out.println("전원on");
		System.out.println("전원off");
		System.out.println("전화걸기");
		System.out.println("메시지");
		

	}
}

class iPhone extends Cellphone {
	iPhone() {
		super();
		System.out.println("FaceId" );
		System.out.println("FaceTime" );
		System.out.println("애플패이" );
		
	}
}

class Samsung  extends Cellphone {
	Samsung() {
		super();
		System.out.println("지문인식");
		System.out.println("삼성페이");
		System.out.println("울트라줌");
		
	}
}
class LG  extends Cellphone {
	LG() {
		super();
		System.out.println("LG페이");
		System.out.println("손동작인식");
		
		
	}
}

public class ExamHeritance04 {
	public static void main(String[] args) {
		Cellphone b = new iPhone();
		System.out.println("===========");
		Cellphone b2 = new LG();
		System.out.println("===========");
		Cellphone b3 = new Samsung();
		

	}

}


