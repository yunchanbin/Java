package ch03;

public class ws0405 {

	public static void main(String[] args) {
		int width = 5;
		int high = 7;
		
		double result1 = Math.pow(width, 2) + Math.pow(high, 2);
		double result2 = Math.sqrt(result1);
		// Math.hypot(width, high) 로 간단하게 계산 가능 (제곱합의 제곱근)
		
		double result3 = Math.round(result2 * 1000) / 1000.0;
		// 1000을 곱하여 round로 소수점이 날아간 상태에서 실수형태로 1000.0을 나눠주면 
		// 소수점 3자리 유지 가능
		
		System.out.println(result3);
				
	}

}
