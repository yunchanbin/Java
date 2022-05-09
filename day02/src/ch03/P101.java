package ch03;

public class P101 {

	public static void main(String[] args) {
		char result = 0; //char도 사실은 정수형에 속한다. 초기화 시켜주는 습관을 들여주는 것이 좋다.
		
		int sum = 90;
		//90이상이면 'A'
		//80이상이면 'B'
		//80미만이면 'C'
		
//		if (sum >= 90) {
//			result = 'A';
//		}else {
//			result = (sum >= 80 ) ? 'B' : 'C';
//		}
		
		result = (sum >= 90 ) ? 'A' : ((sum >= 80 ) ? 'B' : 'C');
		
		System.out.println(result);

	}

}
