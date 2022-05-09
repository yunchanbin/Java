package ch05;

import java.util.Arrays;
import java.util.Random;

public class Ws03 {

	public static void main(String[] args) {
//		int 형 배열 사이즈 6인 배열을 만들고
//		1~6 까지의 값을 입력 한다.
		int ar[]= new int[6];
		Random r = new Random();
		
		// 단, 중복되지 않게 입력 한다.
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(ar.length)+1;
			for (int j = 0; j < i; j++) {
				if(ar[i]==ar[j]) {
					i--;
				}// End if	
			} 
		}// End for	
		
		// 값을 출력 한다.
		System.out.println(Arrays.toString(ar));
		
		
	}

}
