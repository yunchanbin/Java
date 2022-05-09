package P422;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number : ");
		String num = sc.next();
		
		int n = 0;
		try {
		n = Integer.parseInt(num);
		}catch(NumberFormatException e) {
//			System.out.println(e);
//			e.printStackTrace();
			System.out.println("정수가 아닙니다.");
		}
		System.out.println(n);
		
		int result = 0;
		try {
			result = 100 / n;
		}catch(ArithmeticException e ){
			System.out.println("분모는 0이 될 수 없습니다.");
		}
		System.out.println(result);
		sc.close();
	}

}
