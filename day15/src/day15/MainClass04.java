package day15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("E:\\lch\\test.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		for(char i = 'A'; i<='Z';i++) {
			
			Thread.sleep(2000);
//			fos.write(i);
			bos.write(i);
		}
		bos.flush();
		bos.close();
//		fos.close();
	}
}
