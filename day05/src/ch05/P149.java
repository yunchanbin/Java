package ch05;

public class P149 {

	public static void main(String[] args) {
		int a = 10;
		
		// int ar [] = {10,11,12,13}; 도 가능하다.
		int ar [] = new int[4]; // 배열의 선언. 사이즈를 반드시 적어줘야 한다.
		ar[0] = 10;
		ar[1] = 11;
		ar[2] = 12;
		ar[3] = 13;
	
		System.out.println(a);
		System.out.println(ar);
				
		for (int i = 0; i < ar.length; i++) {
			int j = ar[i];
			System.out.println(ar[i]+"   "+j);
		}
	}

}
