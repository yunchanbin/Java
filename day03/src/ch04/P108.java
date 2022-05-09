package ch04;

import java.util.Scanner;

public class P108 {

	public static void main(String[] args) {
		System.out.println("Start ....");
		
		Scanner sc = new Scanner(System.in); // 여기서 멈추는 순간 파이프가 꽂힌다.
		System.out.println("Input Number:");
		String num = sc.next();
		// 입력한 숫자가 0이면 프로그램 종료. 그렇지 않으면 출력
		// 1보다 크고 10이하인 숫자가 아니면 종료
		
		int nm = Integer.parseInt(num);
		
		if(nm < 1 || nm > 10) {
			sc.close();
			System.out.println("Bye");
			return;		// main을 종료
		}
		// printf( %d, %s, %f ) 정수, 문자, 실수
		System.out.printf("입력한 값은 %d \n", nm);
		
		if(nm % 2 == 0) {
			System.out.printf("입력한 값 %d는(은) 짝수입니다. \n", nm);
		}else {
			System.out.printf("입력한 값 %d는(은) 홀수입니다. \n", nm);
		}
		
		// 대, 중, 소 입니다.
		if(nm >= 7) {
			System.out.println("대");
		}else if(nm >= 3) {
			System.out.println("중");
		}else {
			System.out.println("소");
		}
		// 삼항연산자로 바꿔보기
		
		String size = (nm >= 7) ? "대" : (nm >= 3) ? "중" : "소";
		System.out.println(size);
		
		
		
		sc.close();		// 파이프를 다시 빼줘야 한다.
		System.out.println("End ....");
	}

}