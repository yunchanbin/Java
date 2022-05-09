package ch04;

public class P131 {
	
	public static void main(String[] args) {

		// i가 짝수일때만 출력해라
		for (int i = 1; i <= 10; i++) {
			if(i%2 == 1) {
				continue;	// 바로 다음 Loop로 이동함
			}
			System.out.println("For Loop:"+i);

		} // end for
		
		System.out.println("------------------------");
		
		int s = 1;
		while (s <= 10) {
			if(s%2 == 1) {
				s++;
				continue;
			}
			System.out.println("While Loop:"+s);
			s++;
		}
	}

}
