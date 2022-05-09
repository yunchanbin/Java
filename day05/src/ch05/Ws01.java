package ch05;

import java.util.Random;

public class Ws01 {

	public static void main(String[] args) {
		double ar[] = new double[5];
		Random r = new Random();
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextDouble() * 10;
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%.1f\t", ar[i]);
		}

	}

}
