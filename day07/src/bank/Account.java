package bank;

import java.util.Arrays;

public class Account {
	//Attribute
	private String acc = null;
	private String name = null;
	private int pw[] = new int[4];
	private double balance = 0.0;

	//Constructor
	public Account() {
	}

	public Account(String acc, String name, int[] pw) {
		this.acc = acc;
		this.name = name;
		for (int i = 0; i < pw.length; i++) {
			this.pw[i] = pw[i];
		}
		
	}

	public Account(String acc, String name, int[] pw, double balance) {
		this.acc = acc;
		this.name = name;
		for (int i = 0; i < pw.length; i++) {
			this.pw[i] = pw[i];
		}
		this.balance = balance;
	}

	
	//Operation
	public int pwIn(int[] pw, String pss, byte code) {
		int c = 0;
		for (int i = 0; i < pw.length; i++) {
			System.out.println(pss.charAt(i) - 48);
			c = (int)pss.charAt(i) - 48;
			//System.out.println((int)c);
			System.out.println(c);
			//유니코드에 따라 첫 글자가 49~57이면 숫자라고 생각하면 될 듯. 
			if ( !(c >= 0 && c <= 9)) {
				System.out.println("오");
				return code = 0;
			}
			pw[i] = c;
			System.out.println(c);
		}
		return code = 1;
	}
	
	
	public void pwCheck(int[] pw, String inpw, byte code) {
		int c = 0;
		for (int i = 0; i < pw.length; i++) {
			c = inpw.charAt(i) - 48;
			//System.out.println((int)c);

			//유니코드에 따라 첫 글자가 48~57이면 숫자라고 생각하면 될 듯. 
			if ( !(c >= 0 && c <= 9)) {
				System.out.println("숫자를 입력하세요");
				return;
			}
			if( pw[i] != c) {
				System.out.println("Wrong Password ... ");
				return;
			}
		}
		code = 1;
		
	}
	
	public void deposit(double money) {
		if(money < 1) {
			System.out.println("입금 금액 오류");
			return;
		}
		this.balance += money;
	}
	
	public String getAcc() {
		return acc;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double money) {
		
		if (money > this.balance) {
			System.out.println("잔액 부족");
		}
		if (money < 1) {
			System.out.println("출금 금액을 확인하세요");
		}
		
		
		this.balance -= money;
	}

	@Override
	public String toString() {
		return "Account [acc=" + acc + ", name=" + name + ", pw=" + Arrays.toString(pw) + ", balance=" + balance + "]";
	}
	
	
}
