package ch04;

import java.util.Random;
import java.util.Scanner;

public class ws02 {

	public static void main(String[] args) {
		//10~99까지의 숫자를 입력 받는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("Number (10 <= num <= 99)..?");
		String snum = sc.next();
		
		//조건: 숫자여야 하며 범위 안의 숫자여야 한다.
		int numsc = 0;
		try {
			numsc = Integer.parseInt(snum);
		}catch(Exception e) {
			System.out.println("Error 1 : 정수를 입력하세요");
			sc.close();
			return;
		}
		if (numsc < 1 || numsc > 99) {
			System.out.println("Error 2 : 범위를 확인하세요");
			sc.close();
			return;
		}
		
		//1부터 입력받은 숫자까지에서 난수를 발생시킨다.
		Random r = new Random();
		int numr = r.nextInt(numsc-1)+2;
		System.out.println("난수 : " + numr);
		
		//1부터 난수까지의 합과 평균을 구한다.
		//단, 짝수의 값의 합과 평균만 구한다.
		double sum = 0;
		int count = 0;
		for (int i = 2; i <= numr; i += 2) {
			sum += i;
			count++;
		}
		
		double avg = sum / count;
		
		System.out.println("1부터 난수까지의 짝수들의 합 : " + sum);
		System.out.println("1부터 난수까지의 짝수들의 평균 : " + avg);
		
		sc.close();
	}

}
