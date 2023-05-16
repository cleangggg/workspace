package time_ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass01 {

	public static void main(String[] args) {
		long t = System.currentTimeMillis();
		System.out.println(t); // 1000분의 1초

		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd일 aa hh시 mm분 ss초");

		String s_t = s.format(d);
		System.out.println(s_t);

	}

}
