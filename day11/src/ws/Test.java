package ws;

public class Test {

	public static void main(String[] args) {
		String s = "abc";
		int n = 123;
		double d = 123.2;
		
		String sst = s.getClass().getName();
		String nst = ((Object)n).getClass().getName();
		
		System.out.println(sst);
		System.out.println(nst);
		System.out.println(((Object)nst).getClass().getName());

	}

}
