package bank;

public class BankApp {

	public static void main(String[] args) {
		Customer c = new Customer("kim");
		System.out.println(c);
		
		//계좌를 여기서 지정해준 다음
		Account [] accs = new Account[3];
		accs[0] = new Account("1111", 10000);
		accs[1] = new Account("2222", 20000);
		accs[2] = new Account("3333", 30000);
		
		//해당 배열을 고객 c에게 할당해줌
		c.setAccs(accs);
		System.out.println(c);
		
		Account myacc = c.getAc("2222");
		System.out.println(myacc);
		
		c.deposit("2222", 50000);
		System.out.println(c);
		
		double sum = c.getBalanceSum();
		System.out.println(sum);
		
	}
	
}
