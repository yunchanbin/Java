package ch04;

import java.util.Scanner;

public class P1099 {

	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number 1..?");
		String n1 = sc.next();
		
		System.out.println("Input Number 2..?");
		String n2 = sc.next();
		
		System.out.println("Input Op..?");
		String op = sc.next();
				
		// OP 검증
		
		if (op.length() > 1 || (!(op.equals("+")) && 
				!(op.equals("-")) && !(op.equals("/")) &&
				!(op.equals("x"))) ) {
			System.out.println("Bye");
			sc.close();
			return;
		}
		
		
		// ���ڸ� �Է� �޴´�.
		
		double num1 = 0.0;
		double num2 = 0.0;
		
		//try 안에서 문제가 발생하면
		try {
			num1 = Double.parseDouble(n1);
			num2 = Double.parseDouble(n2);
		}catch(Exception e) {
			System.out.println("숫자를 입력하세요.");
			sc.close();
			return;
		//catch가 실행된다. 위에서 발생한 문제를 처리할 수 있음	
		}
		
		
		
		//System.out.println(n1.length());
		System.out.printf("입력한 내용은 %s  %s  %s 입니다. \n",n1,op,n2);
		
		// 연산처리
		double result = 0.0;
		
		if(op.equals("+")) {
			result = num1 + num2;
		}else if(op.equals("-")){
			result = num1 - num2;
		}else if(op.equals("x")) {
			result = num1 * num2;
		}else {
			result = num1 / num2;
		}
		
		String str = "";
		str = (result <0) ? "음수" : "양수";
		
		String str2 = "";
		if(result >= 10) {
			str2 = "큰수";
		}else if(result >= 5) {
			str2 = "중간수";
		}else {
			str2 = "작은수";
		}
		
		System.out.println(result);
		System.out.println(str);
		System.out.println(str2);
		
		sc.close();
		System.out.println("End");
	}

}

