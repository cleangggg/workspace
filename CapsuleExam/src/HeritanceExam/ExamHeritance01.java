package HeritanceExam;

class Boarding {
	Boarding() {
		System.out.println("악셀");
		System.out.println("브레이크");
		System.out.println("와이퍼");
		System.out.println("라이트");
	}
}

class Ship extends Boarding {
	Ship() {
		super();
		System.out.println("닻");
		System.out.println("돛");
	}
}

class Car extends Boarding {
	Car() {
		super();
		System.out.println("엔진모드");
		System.out.println("좌석열선");
	}
}

class AirPlane extends Boarding {
	AirPlane() {
		super();
		System.out.println("랜딩기어");
	}
}

class SubWay extends Boarding {
	SubWay() {
		super();
		System.out.println("스크린도어 기능");
	}

}

public class ExamHeritance01 {
	public static void main(String[] args) {
		Boarding b = new AirPlane();
		System.out.println("===========");
		Boarding b2 = new Car();
		System.out.println("===========");
		Boarding b3 = new Ship();
		System.out.println("===========");
		Boarding b4 = new SubWay();
		
	}

}
