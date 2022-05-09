package ch03;

public class P64 {

	public static void main(String[] args) {
		// 단항연산자
		int a = 10;
		int b = 20;
		int aa = ++a; // 단항연산과 동시에 a에 1을 더해준다.
		int bb = b++; // 단항연산이 끝나고 나서 b에 1을 더해준다.
		System.out.println(bb);
		System.out.println(b);
		
		int c = 10;
		int d = 10;
		int sum = c++ + ++d;
		System.out.println(sum);
		System.out.println(c);
		System.out.println(d);
		
		
		// 이항연산자
		int result = a % b;	// %는 나머지를 계산하는 연산자
		System.out.println(result);
		
		int data = 100;
		//data = data + 1;
		data += 1;			// 이것도 이항연산의 일종이다.
		
		// 비교연산
		int a1 = 10;
		int a2 = 20;
		
		if (a1 <= a2) {
			System.out.println("OK");
		}else {
			System.out.println("FAIL");
		}
		
		// 논리연산
		int b1 = 10;
		int b2 = 20;
		int d1 = 10;
		int d2 = 20;
		
		// || : or (첫번째에서 true 뒤에는 실행할 필요 없으니 생략)
		// |  : or (첫번째에서 true가 나오더라도 뒤에 실행)
		// && : and (첫번째에서 false 뒤에는 실행할 필요 없으니 생략)
		// &  : and (첫번째에서 false가 나오더라도 뒤에 실행)
		// 퍼포먼스를 요구한다면 두개짜리를 쓰고 카운트가 필요한 경우에는 한개짜리만 쓰면 된다.
		// 조건의 개수가 많아질 수록 많이 차이날 수 있음.
		
		
		if ((b1 < b2) | (d1 > d2++)) {
			System.out.println("OK");
		}else {
			System.out.println("FAIL");
		}
		System.out.println(d2);
		
		// !(조건) : 조건이 false이면...  (not이라고 함)
		if( !(b1 > b2)) {
			System.out.println("b2가 크다");
		}else {
			System.out.println("b1이 크다");
		}
		
		// 삼항연산
		int e1 = 10;
		int e2 = 20;
		int eresult = 0;
		if (e1 <= e2) {
			eresult = 100;
		}else {
			eresult = 200;
		}
		System.out.println(eresult);
		// 값을 받아 올 변수 = (조건) ? true일 경우 출력 : false일 경우 출력
		int eresult2 = (e1 <= e2) ? 100 : 200;
		System.out.println(eresult2);
		
	}

}
