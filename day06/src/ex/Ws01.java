package ex;

import java.util.Random;
import java.util.Scanner;

public class Ws01 {

	public static void main(String[] args) {
		int ar[][] = new int[3][3];
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				ar[i][j] = rd.nextInt(99) + 1;
				System.out.printf("%d\t",ar[i][j]);
			}//End for
				System.out.println("");
		}//End for
		
		
		while(true) {	
			System.out.println("- Input 'l' or 'c' or 'q'");
			String cmd = sc.next();

			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}
						
			else if(cmd.equals("l")) {
				System.out.println("Input low number 1~3 (q:Back) : ");
				String lows = sc.next();
				if (lows.equals("q")) {
					continue;
				}	
				int low = 0;
				try {
					low = Integer.parseInt(lows);
				}catch(Exception e) {
					System.out.println("Error 1 : 정수를 입력하세요.");
					continue;
				}
				
				if(low > 3 || low < 1) {
					System.out.println("Error 2 : 범위를 확인하세요.");
					continue;
				}
			
				double sum = 0.0;
				for (int i = 0; i < ar[0].length; i++) {
					System.out.printf("%d\t", ar[low-1][i]);
					sum += ar[low-1][i];
				}
				System.out.println("");
				System.out.printf("sum : %.0f, avg : %.3f\n\n", sum,sum/ar[0].length);
			}
						
			else if(cmd.equals("c")) {
				System.out.println("Input column number 1~3 (q:Back) : ");
				String columns = sc.next();
				if (columns.equals("q")) {
					continue;
				}
				int column = 0;
				try {
					column = Integer.parseInt(columns);
				}catch(Exception e) {
					System.out.println("Error 1 : 정수를 입력하세요.");
					continue;
				}
				
				if(column > 3 || column < 1) {
					System.out.println("Error 2 : 범위를 확인하세요.");
					continue;
				}
			
				double sum = 0.0;
				for (int i = 0; i < ar[0].length; i++) {
					System.out.printf("%d\t\n", ar[i][column-1]);
					sum += ar[i][column-1];
				}

				System.out.printf("sum : %.0f, avg : %.3f\n\n", sum,sum/ar[0].length);
			}else {
				System.out.println("Please input 'l' or 'c' or 'q'");
			}
			
			
			
		}//End while
		sc.close();
	}

}
