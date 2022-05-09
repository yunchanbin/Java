package ws;

import java.util.Arrays;
import java.util.Random;

public class Ws03 {

	public static void main(String[] args) {
		int ar[] = new int[6];
		Random rd = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[1] = rd.nextInt(6) + 1;
			for (int j = 0; j < i; j++) {
				if (ar[j] == ar[i]) {
					i--;
				}//End if
			}//End for
		}//End for
		System.out.println(Arrays.toString(ar));
	}

}
