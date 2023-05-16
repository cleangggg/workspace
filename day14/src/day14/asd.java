package day14;

import java.util.Random;

class ab{
	
	public void asd() {
		System.out.println(123);
	}
	
	public void asd11() {
		System.out.println(12123);
	}
	public void asd2() {
		System.out.println(11223);
	}
	public void asd3() {
		System.out.println(112323);
	}
	
}



public class asd {
public static void main(String[] args) {
	 Random random = new Random(); //랜덤 객체 생성(디폴트 시드값 : 현재시간)
     random.setSeed(System.currentTimeMillis()); //시드값 설정을 따로 할수도 있음

     
     

     for(int i=0; i<5; i++) {
    	 int num = random.nextInt(4);
    	 int num_c = num+10;
    	 System.out.println("n 미만의 랜덤 정수 리턴 : " + 
    			 
    			 num_c);
     }

}	

	
	
}

