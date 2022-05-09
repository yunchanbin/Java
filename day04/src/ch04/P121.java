package ch04;

import java.util.Random;

public class P121 {

	public static void main(String[] args) {
		// Random을 통해서 2~99까지의 난수를 발생시킨다.
		Random r = new Random();
		int n = r.nextInt(98) + 2;
		// System.out.println("난수 : " + n);
		
		// 1부터 난수까지의 합과 평균을 출력한다.
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			count++;
		}
		
		double avg = sum / (double)count; // 실수의 결과를 얻으려면 실수로 나눠야 함.
		System.out.printf("1부터 %d까지의 ...%n- 합 : %d\n- 평균 : %.1f\n",n,sum,avg);
	}

}
