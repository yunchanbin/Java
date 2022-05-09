package ch02;

public class P60 {

	public static void main(String[] args) {
		byte b1 = 10;
		float f1 = 2.5f;
		double d2 = 2.5;
		
		//byte bb = b1 + b1; //정수 연산의 기본형은 int이므로 불가능.
		int result = 5 + b1;
		
		//실수는 일단 자동으로 실수로 연산된다?
		float ff = 500 + f1;
		double dd = 50000000000000000000000000.0 + d2;
		
		int result2 = (int)(100 + d2); //사칙연산에서 실수가 섞여있으면 실수 연산이 된다.
		
		System.out.println(result);
		System.out.println(ff);
		System.out.println(dd);
		System.out.println(result2);
	}

}
