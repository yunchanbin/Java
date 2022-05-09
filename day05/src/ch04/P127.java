package ch04;

public class P127 {

	public static void main(String[] args) {
		// 주사위 2개를 던져서 나오는 값의 합이 8이 나오는 경우를 출력하시오
		for (int i = 1; i <= 6; i++) {
			
			for (int j = 1; j <= 6; j++) {
				if (i + j == 8) {
				System.out.printf("%d,%d\t", i,j);
				}
			}
			System.out.println("");		
		}
	}

}
