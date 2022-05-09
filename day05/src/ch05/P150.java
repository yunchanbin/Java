package ch05;

import java.util.Arrays;
import java.util.Random;

public class P150 {

	public static void main(String[] args) {
		int ar [] = new int[10];
		
		//for 문을 이용하여 1 ~9까지 난수를 만들어 배열에 넣어라'
		Random r = new Random();
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(9) + 1;
		}
		
		// 배열 내용을 출력하시오
		System.out.println(Arrays.toString(ar));
		
//		for (int i = 0; i < ar.length; i++) {
//			int j = ar[i];
//			System.out.println(j);
//		}
		
		double sum = 0.0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		double avg = sum / ar.length;
		
		System.out.printf("sum : %.0f, avg : %.1f\n", sum, avg);


	}

}
