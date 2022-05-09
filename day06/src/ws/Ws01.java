package ws;

import java.util.Random;
import java.util.Scanner;

public class Ws01 {

	public static void main(String[] args) {
		//Number Guess Game
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int s = rd.nextInt(100)+1;

		int life = 5; 
		
		while(true) {

			
			System.out.println("Guess the number (1~100)");
			String snum = sc.next();
			if(snum.equals("r")) {
				System.out.println("새 게임을 시작합니다.");
				continue;
			}
			
			int num = 0;
			try {
				num = Integer.parseInt(snum);
			}catch(Exception e) {
				System.out.println("숫자를 입력하세요.");
				continue;
			}
			
			if(num < 1 || num > 100) {
				System.out.println("범위를 확인하세요.");
				continue;
			}
			
			if(num == s) {
				System.out.println("\nCongratulations!");
				break;
			}else if(num > s) {
				life--;
				System.out.printf("Down\t");
			}else if(num < s) {
				System.out.printf("Up\t");
				life--;
			}
			
			if (life == 0) {
				System.out.println("\nGAME OVER ...");
				sc.close();
				break;
			}
			
			System.out.println("Life : "+life);
			
		}

		sc.close();
		
	}

}
