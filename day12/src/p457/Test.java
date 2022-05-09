package p457;

public class Test {

	public static void main(String[] args) {
		Object obj = new String("abc");
		Object obj2 = new CustomerVO("id01", "pwd01", "lee");

		CustomerVO c = (CustomerVO) obj2;
		System.out.println(c.getName());

		Object obj3 = 10;
		Object obj4 = new Integer(10);

	}

}
