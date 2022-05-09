package ch04;

import java.util.Scanner;

public class P122 {

	public static void main(String[] args) {
		// Scanner 를 이용하여 2 ~ 99까지의 정수를 입력받는다.
		// 범위를 벗어나면 Bye 프로그램 종료
		Scanner sc = new Scanner(System.in);
		System.out.println("Nummber ...?");
		String n = sc.next();
		
		int d = 0;
		
		// 정수가 아닌 경우
		try {
			d = Integer.parseInt(n); 
		}catch(Exception e) {
			sc.close();
			System.out.println("Bye 2");
			return;
		}
		
		// 정수의 범위 체크
		if (d < 2 || d > 99) {
			sc.close();
			System.out.println("Bye 1");
			return;
		}
		
		
		// 1부터 입력 받은 수까지의 합과 평균을 출력하시오.
//		
//		double sum = 0;
//		int count = 0;
//		for (int i = 1; i <= d; i++) {
//			sum += i;
//			count++;
//		}

		
		//while 문으로 작성
		int s = 1;
		int count = 0;
		double sum = 0.0;
		while (s <= d) {
			sum += s;
			s++;
			count++;
		}
		
		double avg = sum/count;

		System.out.printf("1부터 %d까지의 ...\n- 합 : %.0f\n- 평균 : %.1f\n", d, sum, avg);

		sc.close();
		
	}

}
