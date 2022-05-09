package ch05;

import java.util.Arrays;
import java.util.Random;

public class Ws02 {

	public static void main(String[] args) {
		int ar[] = new int[6];
		Random r = new Random();
		
		//1~99까지의 랜덤한 숫자를 입력 한다.
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(99)+1;
		}
		
		
		//배열의 값이 홀수의 값들만의 합과 평균을 구한다
		double sum = 0.0;
		int count = 0;
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2 == 0) {
				continue;
			}
			sum += ar[i];
			count++;
		}
		
		double avg = sum / count;
		System.out.println(Arrays.toString(ar));
		System.out.printf("합 : %.0f\t평균 : %.3f", sum, avg);
	}

}
