package app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String pwd = "12345";

		Scanner sc = new Scanner(System.in);
		System.out.println("Select Menu ...");
		System.out.println("0 : Exam result(Pass or Fail)");
		System.out.println("1 : Management");
		String op = sc.next();

		if (op.equals("0")) {
			UI ui = new UI();
		} else if (op.equals("1")) {
			System.out.println("Input PASSWORD ...");
			String scpwd = sc.next();
			if (scpwd.equals(pwd)) {
				UI2 ui = new UI2();
			} else {
				System.out.println("Wrong PASSWORD ...");
			}
		}

	}

}
