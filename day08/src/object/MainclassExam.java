package object;

import java.util.ArrayList;
import java.util.HashMap;

public class MainclassExam {
	public static void main(String[] args) {
		String [] arr = new String[5];
		ArrayList<String> list =new ArrayList<>();
		HashMap<String, String > map = new HashMap<>();
 		TestClassExam t =new TestClassExam();
 		
 		String a = t.Input();
 		
 		arr[0] = a;
 		list.add(a);
 		map.put(a, a);
		
 		t.Output(map);
 		t.Output(list);
		t.Output(arr[0]);
		
		int b = t.Input2();
		t.exam1(b);
		t.exam2(b);
		t.exam3(b);
		t.exam4(b);
		
		
		
	}
}
