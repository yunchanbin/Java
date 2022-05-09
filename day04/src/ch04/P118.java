package ch04;

import java.util.Random;

public class P118 {

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(3) + 1; // 1~3
		System.out.println(n);
		
		
		// break를 적절히 사용하면 등급별 권한을 부여할 수 있다.
		switch (n) {
		case 1:
			System.out.println("냉장고");
		
		case 2:
			System.out.println("세탁기");
		
		case 3:
			System.out.println("핸드폰");
			break;
		default:
			System.out.println("냉장고");
			break;
		}
	
	}

}
