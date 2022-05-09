package ch02;

public class P44 {

	public static void main(String[] args) {
		int v1 = 10; //10진
		int v2 = 012; // 0을 앞에다 먼저 쓰면 8진수로 인식
		int v3 = 0x000A; // 0x를 앞에다 먼저 쓰면 16진수로 인식
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		byte b1 = 10;
		byte b2 = 10;
		byte b3 = (byte)(b1 + b2); // 정수 끼리의 연산이 일어나면 무조건 int 형으로 바꿔줌.
		System.out.println(b3);
		
		int vi1 = 1500000000; // 15억
		int vi2 = 1500000000;
		//long result = (long)(vi1 + vi2); // 이렇게 계산해도 어차피 long으로 되기 전에 짤려버리기 때문에 이상하게 출력됨.
		long result = (long)vi1 + (long)vi2;
		System.out.println(result); // 사칙연산은 기본이 int라서 오류는 안 나지만 짤려서 출력됨.
		
		long vl1 = 15000000000L; // 150억은 int를 넘어가기 때문에 뒤에 L을 붙여서 형식을 바꿔준다. 
		long vl2 = 15000000000L; 
		long resultL = vl1 + vl2; // long끼리 연산할 때는 int로 안 바뀌는 특징이 있다.
		System.out.println(resultL);
	}

}
