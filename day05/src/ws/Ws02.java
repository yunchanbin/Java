package ws;

import java.util.Arrays;
import java.util.Random;

public class Ws02 {

	public static void main(String[] args) {
		int ar[] = new int[10];
		Random rd = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rd.nextInt(99)+1;
		}
		System.out.println(Arrays.toString(ar));
		
		double sum = 0.0;
		int cnt = 0;
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]%2 == 1) {
				sum += ar[i];
				cnt++;
			}
		} 
		
		System.out.println(sum);
		System.out.println(cnt);
		System.out.printf("result: %.2f \n", sum/cnt);
		
		
	}

}
