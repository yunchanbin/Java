package ch04;

public class P120 {

	public static void main(String[] args) {
		// 1~10까지의 합을 구하시오
		
		int sum = 0;
		int count = 0;
		for (int i = 1; i < 11; i++) {
			sum = sum + i;	// sum += i;
			//System.out.println(i+" : "+sum);
			count++;
		}
		System.out.println("-----------------------------");
		System.out.println(count);
		System.out.println(sum/count);
		
		int s = 1;
		int sum2 = 0;
		while (s <= 10) {
			sum2 += s;
			//System.out.println(s+" : "+sum);
			s++;
		}
		double avg = 1;
		if(s == 1) {
			avg = 2;
		}else {
			avg = sum2 / (s-1);
		}
		System.out.println(sum2);
		System.out.printf("%.2f \n",avg);
	}

}
