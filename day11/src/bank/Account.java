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
	public void deposit(double money) throws MinusException {
		if(money < 1) {
			throw new MinusException("마이너스입니다.");
		}
		this.balance += money;
	}
	
	// 출금 금액이 1보다 작으면 안된다.
	// 출금 금액이 잔액보다 많으면 안된다.
	public void withdraw(double money) throws MinusException, OverdrawnException {
		if (money > this.balance) {
			throw new OverdrawnException("잔액부족");
		}
		if (money < 1) {
			throw new MinusException("마이너스입니다.");
		}
		
		
		this.balance -= money;
	}
	

	
	
}
