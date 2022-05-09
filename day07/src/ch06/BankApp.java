package ch06;

public class BankApp {

	public static void main(String[] args) {
		Account acc1 = new Account("1111-2222");
		System.out.println(acc1.toString());
	
		acc1.deposit(10000);
		System.out.println(acc1.toString());
		
		
		// Encapsulation
//		acc1.balance = 5000000000.0;	
		//private 으로 선언한 balance이기 때문에 프로그램 내에서는 수정할 수 없다. (개체의 속성에 접근하지 못하도록 막는다.)
		//public으로 존재하는 deposit이나 withdraw으로 balance를 바꿀 수 있다.
		
		acc1.withdraw(5000);
		System.out.println(acc1);
		

		String accNo = acc1.getAccNo();
		double balance = acc1.getBalance();
		System.out.printf("계좌정보 : %s %.2f \n", accNo, balance);
		
		
	
		
	}
	
}
