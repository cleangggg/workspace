package set;

import java.util.ArrayList;
import java.util.HashSet;


/*
set
- 순서가 존재하지 않는다.
- 데이터가 중복을 허용하지 않는다.
- 배열을 안의 공간을 16개로 잡고 75%가 차면 새롭게 16개의 공간생성한다.
 */

public class Ex01 {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("aaa");
		set.add("bbb");
		set.add("aaa");
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("aaa");
		
		System.out.println("set:"+set);
		System.out.println("arrs:"+arr);
		
		System.out.println("=====remove====");
		set.remove("bbb");
		System.out.println("set:"+set);
		
		System.out.println(set.contains("aaa"));
		
		
	}
	
}
