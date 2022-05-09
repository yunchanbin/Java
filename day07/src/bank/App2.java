package bank;

import java.util.Arrays;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		System.out.println("start ...");
		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		double money = 0.0;
		int ar[] = new int[4];
		double balance = 0.0;
		byte code = 0;
		
 		while(true) {
 			code = 0;
			
			System.out.println("Input cmd(a,d,w,s,q) ...");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;

				
			}else if(cmd.equals("a")) {
				System.out.println("Assign 1 : Input new Account Number ...");
				String accNo = sc.next();
				
				System.out.println("Assign 2 : Input new Password ...");
				String pss = sc.next();
				acc.pwIn(ar, pss, code);
				
//				if (code == 0) {
//					continue;
//				}
				System.out.println("fuck");
				System.out.println("Assign 3 : Input Password Again ... ");
				String inpw = sc.next();
				acc.pwCheck(ar,inpw,code);
				if (code == 0) {
					continue;
				}
				System.out.println("Assign 4 : Deposit... ? ");
				
				 
			
			}else if(cmd.equals("d")) {
				System.out.println("Deposit : Input amount of money ...");
				String smoney = sc.next();
				System.out.println(money);
				
				
			}else if(cmd.equals("w")) {
				System.out.println("Withdraw : Input amoun of money ...");
				String smoney = sc.next();
				System.out.println(money);
				
				
			}else if(cmd.equals("s")) {

				System.out.println("Password : ");
				String inpw = sc.next();
				acc.pwCheck(ar,inpw,code);
				if (code == 0) {
					continue;
				}
				
				System.out.println("OK");
				System.out.println("Your  ...");
				System.out.println(balance);

			}
			
		}
		
		sc.close();
		System.out.println("End ...");
	}

}
