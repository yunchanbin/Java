package ch04;

public class P125 {

	public static void main(String[] args) {
		outter:	// 이렇게 설정해 놓으면 
		for (int i = 2; i < 10; i++) {
			if (i%2 == 1) {
				continue;
			}
			System.out.println(i+" 단 시작 ---------------");
			for (int j = 1; j < 10; j++) {
				if ((i * j) == 99 ) {
					break outter;	// 여기서 break 했을 때 outter에 속한 for까지 나갈 수 있다.
									// 상위 for문과 함께 제어할 수 있음
				}
					
				System.out.printf("%d x %d = %d \t",i,j,(i*j));
			}
			System.out.println("");
		}
	}

}
