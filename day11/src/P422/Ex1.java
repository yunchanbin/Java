package P422;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number : ");
		String num = sc.next();

		int n = 0;
		int result = 0;
		try {
			n = Integer.parseInt(num);
			result = 100 / n;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("분모가 0입니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
		} finally {						//finally is always operate
			System.out.println(result);
			sc.close();
			System.out.println("End");
		}
	}

}
