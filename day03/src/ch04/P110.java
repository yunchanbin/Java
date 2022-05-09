package ch04;

import java.util.Scanner;

public class P110 {
//10~99사이의 정수를 입력받아서 1부터 그까지의 합과 평균을 구해라 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number 1");
		String n1 = sc.next();

		
		//입력 형식을 정수로
		char c1 = n1.charAt(0);

		if ( !(c1 >= '1' && c1 <= '9')) {
			System.out.println("Error : Number에는 숫자(정수)를 입력하세요.");
			sc.close();
			return;
		}
		
		//두자리 수로
		int len1 = n1.length();
		if(len1 != 2) {
			System.out.println("Error : 두자리 수를 입력하시오.");
			sc.close();
			return;
		}
		
		int d1 = Integer.parseInt(n1);
		int sum = 0;
		for (int i = 1; i <= d1 ; i++) {
			sum = sum + i;
		}
		double avg = sum / (double)d1;
		
		System.out.printf("합 : %d \n평균 : %.1f \n",sum, avg);
		
		sc.close();
	}

}
