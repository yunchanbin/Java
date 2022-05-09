package ch03;

public class P86 {

	public static void main(String[] args) {
		String str = "NaN";	// NaN은 어떤 상황인지 잘 모르겠다.
		char c = 'A';
		double a = Double.valueOf(str);
		double result = 0.0;
		
		if (Double.isNaN(a)) {
			System.out.println("입력 오류");
		}else {
			result = a * 100;
		}
		
		System.out.println(result);
	}

}
