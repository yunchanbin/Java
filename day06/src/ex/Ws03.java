package ex;

import java.util.Random;
import java.util.Scanner;

public class Ws03 {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Lotto do you want to buy? (Max 10): ");
		
		String lows = sc.next();
		int low = 0;
		try {
			low = Integer.parseInt(lows);
		}catch(Exception e) {
			System.out.println("Error 1 : 정수를 입력하세요.");
			
		}
	
		if(low > 10 || low < 1) {
			System.out.println("Error 2 : 범위를 확인하세요.");
			sc.close();
			return;
		}
		
		int ar[][] = new int[low][6];
		
		for (int i = 0; i < low; i++) {
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
		
		sc.close();
	}

}
