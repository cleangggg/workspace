package constructor;

import java.util.HashMap;
import java.util.Scanner;

public class win10Main {
public static void main(String[] args) {
	HashMap info = new HashMap<>();
	String calc = "calc", notepad = "notepad", mspainter="mspainter";
	String msg = null;
	Scanner input = new Scanner(System.in);
	win10Service s = new win10Service();
	
	while(true) {
		System.out.println("1.성능");
		System.out.println("2.기능사용");
		int num = input.nextInt();
		switch(num) {
		case 1:
			System.out.println("뭐는");
			String name = input.next();
			System.out.println("뭐다");
			String in = input.next();
			info.put(name, in);
			win10Service map = new win10Service(info);
			System.out.println(map.getmap());
			break;
		case 2:
			System.out.println("1.계산기");
			System.out.println("2.메모장");
			System.out.println("3.직접입력");
			num = input.nextInt();
			switch(num) {
			case 1:
				win10Service calc1 = new win10Service(calc);
				break;
			case 2:
				win10Service notepad1 = new win10Service(notepad);

				break;
				
			case 3:
				System.out.println("직접입력: ");
				msg = input.next();
				win10Service msg1 = new win10Service(msg);
				break;
				

			}
			
			break;
			
		
		
		}
		
		
	}
	
	
}
}
