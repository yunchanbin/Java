package ex;

import java.util.Random;

public class Ws02 {

	public static void main(String[] args) {
		int ar[][] = new int[3][6];
		Random rd = new Random();
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				ar[i][j] = rd.nextInt(45)+1;
				for (int k = 0; k < j; k++) {
					if(ar[i][j] == ar[i][k]) {
						j--;
					}//End if
				}
			}	
		}//End for
		
		for (int a = 0; a < ar.length; a++) {
			for (int b = 0; b < ar[0].length; b++) {
				System.out.printf("%d\t", ar[a][b]);
			}
			System.out.println("");
		}//End for
	}

}
