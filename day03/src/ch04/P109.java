package ch04;

import java.util.Scanner;

public class P109 {

	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number 1..?");
		String n1 = sc.next();
		System.out.println("Input Number 2..?");
		String n2 = sc.next();
		
		// 입력 받은 숫자가 한자리 수가 아니면 종료
		int len1 = n1.length();
		int len2 = n2.length();
		
		if(len1 != 1 || len2 != 1) {
			System.out.println("Bye");
			sc.close();
			return;
		}
		
		// 숫자만 입력 받는다.
		char c1 = n1.charAt(0);	//.charAt(0)에서 0은 무슨 뜻인가요??
		char c2 = n2.charAt(0);
		//입력한 첫 글자만 따온다
		
		System.out.println((int)c1);
		
		//유니코드에 따라 첫 글자가 49~57이면 숫자라고 생각하면 될 듯. 
		if ( !(c1 >= '1' && c1 <= '9') || !(c2 >= '1' && c2 <= '9') ) {
			System.out.println("Bye");
			sc.close();
			return;
		}

		//System.out.println(n1.length());
		System.out.printf("입력한 숫자는 %s, %s 입니다. \n" ,n1,n2);
		
		sc.close();
		System.out.println("End");
	}

}
