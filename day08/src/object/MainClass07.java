package object;

import java.util.ArrayList;

public class MainClass07 {

	public static void main(String[] args) {
		
		TestClass07 t = new TestClass07();
		
		t.test01(1);
		t.test02(1);
		//t.test03(1);
	
		ArrayList<String> arr = new ArrayList<>();
		boolean bo = arr.add("111");
		System.out.println(bo);
		

		
	}
	
	
}
