package array;

public class Ex02 {
	public static void main(String[] args) {
		
		int []arr = {111,222,333};
		for ( int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("======");
		for (int n : arr) {
			System.out.println(n);
		}
		System.out.println("=========");
		int index= 0;
		for(int n :arr) {
			arr[index] = n;
			System.out.println(n);
			
			System.out.println(index);
			System.out.println(arr[1]);
		}
		
		
		
	}
}