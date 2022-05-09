package ch04;

import java.util.Random;
import java.util.Scanner;

public class P128 {

	public static void main(String[] args) {
		System.out.println("start ...");
		Scanner sc = new Scanner(System.in);
		
 		while(true) {
			System.out.println("Input cmd(w1,w2,w3) ...");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if(cmd.equals("w1")) {
				//두개의 숫자를 입력받는다.
				//두 수는 숫자여야 하며 1~99까지의 숫자.
				//첫번째 숫자는 두번째 숫자보다 작아야 한다.
				System.out.println("Number 1 (1 <= n1 <= 98) ..?");
				String snum1 = sc.next();
				System.out.println("Number 2 ("+snum1+" < n2 <= 99) ..?");
				String snum2 = sc.next();
				
				int num1 = 0;
				int num2 = 0;
				try {
					num1 = Integer.parseInt(snum1);
					num2 = Integer.parseInt(snum2);
				}catch(Exception e) {
					System.out.println("Error 1 : 정수를 입력하세요");
					continue;
				}
				
				if((num1 > 98 || num1 < 1) || (num2 > 99 || num2 < 1) || num1 > num2) {
					System.out.println("Error 2 : 범위를 확인하세요");
					continue;
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
				
				
				
			}else if(cmd.equals("w2")) {
				//10~99까지의 숫자를 입력 받는다.
				System.out.println("Number (10 <= num <= 99)..?");
				String snum = sc.next();
				
				//조건: 숫자여야 하며 범위 안의 숫자여야 한다.
				int numsc = 0;
				try {
					numsc = Integer.parseInt(snum);
				}catch(Exception e) {
					System.out.println("Error 1 : 정수를 입력하세요");
					continue;
				}
				if (numsc < 1 || numsc > 99) {
					System.out.println("Error 2 : 범위를 확인하세요");
					continue;
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
				

			}
		}
		
		sc.close();
		System.out.println("End ...");
	}

}
