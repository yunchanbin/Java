package ch03;

public class P85 {

	public static void main(String[] args) {
		int a = 100;
		double b = 0.0;
		double result = 0.0;
		
		result = a / b;
		
		if (Double.isInfinite(result)) {
			System.out.println("분모가 0.0입니다.");
		}else {
			System.out.println(result);
		}

	}

}
