package inteface;

public class A08지상군 implements Unit08 {

	@Override
	public void attack() {
		System.out.println("지상군 공격합니다");
	}

	@Override
	public void defense() {
		System.out.println("지상군 방어합니다.");
	}

}
