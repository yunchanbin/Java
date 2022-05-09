package bank;

public class Account {
	private String accNo;
	private double balance;
	
	
	public Account() {
	}
	
	public Account(String accNo) {
		this.accNo = accNo;
	}

	public Account(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}

	
	
	
	public String getAccNo() {
		return accNo;
	}


	public double getBalance() {
		return balance;
	}


	
	
	
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}
	
	// 실행하고 끝나는 함수는 void, 뭔가를 반환하거나 불러오는 것은 return함
	public void deposit(double money) {
		if(money < 1) {
			System.out.println("입금 금액 오류");
			return;
		}
		this.balance += money;
	}
	
	// 출금 금액이 1보다 작으면 안된다.
	// 출금 금액이 잔액보다 많으면 안된다.
	public void withdraw(double money) {
		if (money > this.balance) {
			System.out.println("잔액 부족");
		}
		if (money < 1) {
			System.out.println("출금 금액을 확인하세요");
		}
		
		
		this.balance -= money;
	}
	

	
	
}
