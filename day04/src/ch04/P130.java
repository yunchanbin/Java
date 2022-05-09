package ch04;

public class P130 {
	
	public static void main(String[] args) {
		// i: 7일때 까지만 실행 해라
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("For Loop:"+i);
			if(i == 7) {
				break;
			}
		} // end for
		
		System.out.println("------------------------");
		
		int s = 1;
		while (s <= 10) {
			System.out.println("While Loop:"+s);
			if(s==7) {
				break;	
			}
			s++;
		}
	}

}
