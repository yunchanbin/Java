package ch05;

public class P138 {

	public static void main(String[] args) {
		int a = 10;
		String s1 = "abc"; // 유니코드로 HEAP에 저장. STACK영역에는 주소가 저장됨.
		String s2 = "abc"; // 같은 참조영역을 사용하니까 같은 주소를 가리키면 됨.
		String s3 = new String("abc");
		String s4 = new String("abc"); // new로 선언하면 다른주소에 생성됨.
		String s5 = null;	// String의 초기화. 비어있는 상태로 만들어줌.(주소만 생성하는 듯?)
		
		// equals는 다 똑같이 연산 가능??
		System.out.println(s5);
		
		//System.out.println(s5.length());
		
		char c = s1.charAt(1);
		System.out.println(c);
		
		int len = s2.length();
		System.out.println(len);
		
		String ns = s3.toUpperCase();
		System.out.println(ns);
		
		
		System.out.printf("%d, %s, %s, %s, %s",a,s1,s2,s3,s4);
	}

}
