package ch04;

import java.util.Scanner;

public class P135 {

	public static void main(String[] args) {
		System.out.println("start ...");
		double balance = 10000.0;
		
		Scanner sc = new Scanner(System.in);
		
 		while(true) {
			System.out.println("Input cmd(d,w,s,i,q) ...");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}
			
			else if(cmd.equals("d")) {
				System.out.println("Deposit ...");
				System.out.println("Amount : ");
				String snum = sc.next();
				int amount = 0;
					try {
						amount = Integer.parseInt(snum);
					}catch(Exception e) {
						System.out.println("숫자를 입력하세요");
					}
				if(amount <= 0){
					System.out.println("음수입니다. 다시 진행하세요");
					continue;
				}
				balance += amount;
				System.out.printf("Balance: %.2f \n" , balance);
			}
			
			else if(cmd.equals("w")) {
				System.out.println("Withdraw ...");
				System.out.println("Amount : ");
				String snum = sc.next();
				int amount = 0;
				try {
					amount = Integer.parseInt(snum);
				}catch(Exception e) {
					System.out.println("숫자를 입력하세요");
				}
				
				if (balance < amount) {
					System.out.println("잔액 부족");
					continue;
				}else if(amount <= 0){
					System.out.println("음수입니다. 다시 진행하세요");
					continue;
				}
				balance += amount;
				System.out.printf("Balance: %.2f \n" , balance);
				
//				if (balance < amount) {
//					System.out.println("잔액 부족");
//				}else {
//					balance -= amount;
//				}
			}
			
			else if(cmd.equals("s")) {
				System.out.println("Select Balance ...");
				System.out.printf("Balance: %.2f \n" , balance);
			}
			
			else if(cmd.equals("i")) {
				System.out.println("이자율 입력 (%) ...");
				String snum = sc.next();
				Double i = 0.0;
				try {
					i = Double.parseDouble(snum);
				}catch(Exception e) {
					System.out.println("숫자를 입력하세요");
				}
				if(i <= 0){
					System.out.println("음수입니다. 다시 진행하세요");
					continue;
				}
				System.out.printf("원금 : %.2f, 이자 : %.2f, 이자율 : %.2f %%\n",balance,(balance*i/100.0),i);
				
				System.out.printf("Balance: %.2f \n" , balance);
			}
		}
		
		sc.close();
		System.out.println("End ...");
	}

}
