package ch02;

public class P39 {

	public static void main(String[] args) {
		byte b1 = 127;
		System.out.println(b1);
		
		//char 에는 반드시 알파벳 한 개만 들어갈 수 있다.
		//char은 3가지로 표현할 수 있다. 알파벳/integer/유니코
		char c1 = 'A';
		char c2 = 65; // 0X41 : 16진수로 표현한 65
		char c3 = '\u0041';	// unicode
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = '\uac00';
		char c5 = 44032;
		System.out.println(c4);
		System.out.println(c5);
		// 출력할 때 " "를 쓸 필요가 없다는 것을 기억하기.
	}

}
