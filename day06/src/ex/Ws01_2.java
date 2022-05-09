package ex;

import java.util.Arrays;
import java.util.Random;

public class Ws01_2 {

	public static void main(String[] args) {
		int ar[] = new int[5];
		Random rd = new Random();
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rd.nextInt(9) + 1;
		}
		
		int max = 0;
		int min = 9;
		for (int i = 0; i < ar.length; i++) {
			if(max < ar[i]) {
				max = ar[i];
			}else if(min > ar[i]) {
				min = ar[i];		
			}
			
		}//End for
		System.out.println(Arrays.toString(ar));
		System.out.println(max);
		System.out.println(min);
	}

}
