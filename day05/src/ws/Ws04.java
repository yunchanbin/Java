package ws;

import java.util.Arrays;

public class Ws04 {

	public static void main(String[] args) {
		int ar[][] = {{100,99,80,70},{98,91,83,72},{89,96,82,75}};
		System.out.println(ar.length);
		System.out.println(ar[0].length);
		
		
		//for문이 많을 수록 더 많은 메모리가 사용됨. 한번에 처리하는 것이 좋다.
		
		double sum = 0.0;
		double sums = 0.0;
		double as[] = new double[ar.length];
				
				
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				System.out.printf("%d\t", ar[i][j]);
				sum += ar[i][j];
				sums += ar[i][j];
			}
			as[i] = sums/ar[0].length;
			sums = 0.0;
			System.out.println("");
		}
		
		System.out.println(sum);
		System.out.println(sum/(ar.length * ar[0].length));
		System.out.println(Arrays.toString(as));
		
		
		
	}

}
