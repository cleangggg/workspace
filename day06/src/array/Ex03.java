package array;

public class Ex03 {

	public static void main(String[] args) {
		String [] str= {"aaa","Bbb","ccc"};
		
		for (String n :str) {
			System.out.println(n);
		
		}

		int arr[] = {12,54,12,17,25,30};
		for (int n : arr) {
			if (n%2 ==0) {
				System.out.println("짝수: "+n);
			}else {
				System.out.println("홀수: "+n);
			}
			
		}
		
		
	}
	
}
