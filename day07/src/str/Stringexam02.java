package str;

public class Stringexam02 {
	public static void main(String[] args) {
		String str ="김개똥-2017년\n홍길동구리-2015년\n선우선녀-2018년";
		System.out.println("====변경전=====");
		System.out.println(str);
		System.out.println("====변경후=====");
		str = str.replace("-", ":");
		System.out.println(str);
		
	}
}
