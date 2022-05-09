package ch04;

import java.util.Scanner;

public class ws0406 {
//숫자 2개와 연산자를 받아서 연산한다.
//양수인지 음수인지 출력
//10이상이면 큰수, 5이상이면 중간수, 그 미만이면 작은수 출력
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number 1");
		String n1 = sc.next();
		System.out.println("연산자를 입력하시오. (+, -, /, x)");
		String cl = sc.next();
		System.out.println("Number 2");
		String n2 = sc.next();
		
		char c1 = n1.charAt(0);
		char c2 = n2.charAt(0);

		if ( !(c1 >= '1' && c1 <= '9') || !(c2 >= '1' && c2 <= '9') ) {
			System.out.println("Error : Number에는 숫자를 입력하세요.");
			sc.close();
			return;
		}
		
		char cc = cl.charAt(0);
		double d1 = Double.parseDouble(n1); 
		double d2 =	Double.parseDouble(n2);	
		
		double result = 0;
		
		if( cc == '+' ) {
			result = d1 + d2;
		}else if( cc == '-' ) {
			result = d1 - d2;
		}else if( cc == 'x' ) {
			result = d1 * d2;
		}else if( cc == '/' ) {
			if (n2.equals("0")) {
				System.out.println("Error : Number 2는 분자이므로 0을 넣을 수 없습니다.");
				sc.close();
				return;
			}
			result = d1 / d2;
		}else {
			System.out.println("Error : 연산자를 확인하세요.");
			sc.close();
			return;
		}
		
		System.out.printf("%s %s %s = %.3f \n", n1, cl, n2, result);
		
		String pn = (result >= 0) ? "양수" : "음수" ;
		String level = (result >= 10) ? "큰수" : (result >= 5) ? "중간수" : "작은수" ;
		
		System.out.println(pn);
		System.out.println(level);
		
		sc.close();
		
	}

}
