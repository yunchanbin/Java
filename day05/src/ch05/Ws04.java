package ch05;

import java.util.Arrays;

public class Ws04 {

	public static void main(String[] args) {
		
		//학생 별 점수를 출력 한다.
		int ar[][] = new int[3][4];
		
		int ar1[] = {100,99,80,70};
		int ar2[] = {98,91,83,72};
		int ar3[] = {89,96,82,75};
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				if (i==0) {
					ar[i][j] = ar1[j]; 
				}else if (i==1) {
					ar[i][j] = ar2[j]; 
				}else if (i==2) {
					ar[i][j] = ar3[j]; 
				}
				System.out.printf("%d\t",ar[i][j]);
			
			}
			System.out.println("");
		} //End For
		
		// 전체 점수의 합과 평균을 구하시오
		double sum = 0.0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				sum += ar[i][j];
			}
		}
		
		double avg = sum / (ar.length * ar[0].length);
		System.out.printf("총 합 : %.0f, 총 평균 : %.2f \n",sum,avg);
		
		//학생별 평균을 새로운 배열을 만들어 넣고 출력 하시오
		double ar_avg[] = new double[3];
		
		double sum_new = 0.0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				sum_new += ar[i][j];
			}
			ar_avg[i] = sum_new / ar[0].length;
			sum_new = 0.0;
		}
		System.out.printf("학생별 평균 : ");
		System.out.println(Arrays.toString(ar_avg));
		
		
	}

}
