package for_;

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("main");
		int sum =0;
		for(int i =0 ;i<3; i++) {
			sum += i;
			System.out.println(i+"종속문장");
			
		}
		System.out.println("main 종료");
		
		System.out.println("main");
		sum =0;
		for(int i =0 ;i<3; i++) {
			sum += i;
			System.out.println(i+"종속문장");
			
		}
		System.out.println("main 종료");
		
	}
	
}
