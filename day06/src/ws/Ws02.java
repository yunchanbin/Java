package ws;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ws02 {

	public static void main(String[] args) {
		System.out.println("start ...");
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int balance = 10000;

		while (true) {
			System.out.println("Game Start ...");
			System.out.println("(m : See the Menu)");
			String cmd = sc.next();

			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}

			else if (cmd.equals("m")) {
				System.out.println("s : Start the new game");
				System.out.println("a : See the current balance");
				System.out.println("p : Check the prize money");
				System.out.println("q : Quit");
			}

			else if (cmd.equals("s")) {

				int code[] = new int[6];
				for (int i = 0; i < code.length; i++) {
					code[i] = rd.nextInt(15) + 1;
					for (int j = 0; j < i; j++) {
						if (code[j] == code[i]) {
							i--;
						} // End if
					} // End for
				} // End for

				System.out.println(Arrays.toString(code));

				System.out.println("How many Lotto do you want to buy? (Max 10): ");

				String lows = sc.next();

				int low = 0;
				try {
					low = Integer.parseInt(lows);
				} catch (Exception e) {
					System.out.println("Input type only Integer");
					continue;
				}

				if (low > 10 || low < 1) {
					System.out.println("Min : 1, Max : 10");
					continue;
				}

				System.out.println(balance);

				if (balance < low * 1000) {
					System.out.println("Not enough money");
					continue;
				} else {
					balance -= low * 1000;
				}

				System.out.println(balance);
				int ar[][] = new int[low][6];

				for (int i = 0; i < low; i++) {
					for (int j = 0; j < ar[0].length; j++) {
						ar[i][j] = rd.nextInt(15) + 1;
						for (int k = 0; k < j; k++) {
							if (ar[i][j] == ar[i][k]) {
								j--;
							} // End if
						}
					}
				} // End for

				int accord = 0;
				int c = 0;

				for (int a = 0; a < ar.length; a++) {
					accord = 0;
					for (int b = 0; b < ar[0].length; b++) {
						for (int i = 0; i < ar[0].length; i++) {
							if (ar[a][b] == code[i]) {
								accord++;
							} // End if
						}

						System.out.printf("%d\t", ar[a][b]);

					}
					System.out.println("     " + accord + "number was correct");

					switch (accord) {
					case 6:
						c += 100000000; // 1st
						break;
					case 5:
						c += 10000; // 2nd
						break;
					case 4:
						c += 5000; // 3th
						break;
					case 3:
						c += 1000; // 4th
						break;
					default:
						break;
					}

				} // End for

				balance += c;
				if (balance <= 0) {
					System.out.println("\nGAME OVER ... ");
					sc.close();
					return;
				} // End if
			}

			else if (cmd.equals("a")) {
				System.out.printf("Balance: %d \n", balance);
			}

			else if (cmd.equals("p")) {
				System.out.println("1st : 100,000,000");
				System.out.println("2nd : 10,000");
				System.out.println("3th : 5,000");
				System.out.println("4th : 1,000");
			}

		}
		sc.close();
		System.out.println("End ...");
	}

}
