package ch06;

public class App {

	public static void main(String[] args) {
		int a = 100;
		String s = new String("ABC");
		int ar[] = {1,2,3,4};
		
		
		Car c1 = new Car();
		System.out.println(c1.toString());
		System.out.println(c1);			// 위에랑 동일함. toString 안써도 된다.
		String result1 = c1.toString();
		System.out.println(result1);
		
		
		Car c2 = new Car();
		System.out.println(c1);	
	
	
	
	}

}
