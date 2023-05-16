package array;

public class Ex01 {

	public static void main(String[] args) {

		int[] arr = new int[3];
		arr[0] = 1111;
		arr[1] = 2222;
		arr[2] = 33333;
		int a = arr.length;
		System.out.println(a);
		System.out.println(arr);
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);

		}
		int[] arr02 = { 111, 222, 333, 444, 555 };
		System.out.println("arr2 length:" + arr02.length);

		for (int i = 0; i< arr02.length; i++) {
			System.out.println(arr02[i]);

		}
		
		int []arr03 = new int[] {1,2,3,4,5};
		for(int i =0 ; i <arr03.length ; i++) {
			System.out.println(arr03[i]);
		}
		
	}
}
