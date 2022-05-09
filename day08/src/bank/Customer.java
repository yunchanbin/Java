package bank;

import java.util.Arrays;

public class Customer {
	private String name;
	private Account[] accs;
	
	
	public Customer() {
		
	}
	
	public Customer(String name) {
		this.name = name;
	}
	public Customer(String name, Account[] accs) {
		this.name = name;
		this.accs = accs;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	
	public Account[] getAccs() {
		return accs;
	}
	
	public void setAccs(Account[] accs) {	//배열 형태로 값이 들어가는 것을 확인할 수 있다.
		this.accs = accs;
	}
	//계좌 잔액의 합을 구하는 기능
	public double getBalanceSum() {
		double sum = 0.0;
		for (int i = 0; i < accs.length; i++) {
			sum += accs[i].getBalance();
		}
		
		return sum;
	}
	
	
	
	
	//배열을 받아서 
	public void deposit(String accNo, double money) {
		for (int i = 0; i < accs.length; i++) {
			if (accNo.equals(accs[i].getAccNo())) {
				accs[i].deposit(money);
			}
		}

	}
	
	//"1111"이라고 넣으면 해당하는 계좌의 정보를 리턴
	public Account getAc(String accNo) {
		Account acc = null;
		for (int i = 0; i < accs.length; i++) {
			if (accNo.equals(accs[i].getAccNo())) {
				acc = accs[i];
			}
		}

		return acc;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", accs=" + Arrays.toString(accs) + "]";
	}
	
	

}
