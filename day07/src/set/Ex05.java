package set;

import java.util.ArrayList;

public class Ex05 {
	
	public static void main(String[] args) {
		
		int arr [] = {75,85,100,95,50};
		
		int temp;
		for (int i =0; i<4; i++) {
			for (int j = 0; j<4-i ; j++) {
				if (arr[j]>arr[j+1]) {
					temp =arr[j];
					arr[j] =arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i=0 ; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	

}
