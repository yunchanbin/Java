package ch04;

import java.util.Scanner;

public class ws01 {

	public static void main(String[] args) {
		//두개의 숫자를 입력받는다.
		//두 수는 숫자여야 하며 1~99까지의 숫자.
		//첫번째 숫자는 두번째 숫자보다 작아야 한다.
		Scanner sc = new Scanner(System.in);
		System.out.println("Number 1 (1 <= n1 <= 98) ..?");
		String snum1 = sc.next();
		System.out.println("Number 2 (n1 < n <= 99) ..?");
		String snum2 = sc.next();
		
		int num1 = 0;
		int num2 = 0;
		try {
			num1 = Integer.parseInt(snum1);
			num2 = Integer.parseInt(snum2);
		}catch(Exception e) {
			System.out.println("Error 1 : 정수를 입력하세요");
			sc.close();
			return;
		}
		
		if((num1 > 98 || num1 < 1) || (num2 > 99 || num2 < 1) || num1 > num2) {
			System.out.println("Error 2 : 범위를 확인하세요");
			sc.close();
			return;
		}
		
		System.out.printf("n1 : %d\nn2 : %d\n",num1,num2);
		
		
		//첫번째 숫자부터 두번째 숫자의 합과 평균을 구하시오
		double sum = 0.0;
		int count = 0;
		for (int i = num1; i <= num2; i++) {
			sum += i;
			count++;
		}
		
		double avg = sum / count; // count = ( num2 - num1 ) + 1
		
		System.out.printf("합 : %.0f, 평균 %.1f \n", sum, avg);
		
		sc.close();
	}

}
