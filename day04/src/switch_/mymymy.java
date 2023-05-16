package switch_;



public class mymymy {

	public static void main(String[] args) {

		int k = 1;
		for (int i = 1; i <6; i++) {
			//System.out.println(i+"번째 값은:"+k);
			System.out.println(k);
			switch (i) {
			case 1:
				k++;
				break;
			case 2:
				--k;
				break;
			case 3:
				k *= 3;
			case 4:
				k -= 10;
				continue;	
		
		

			}

		}

	}
}
