package lotto;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoGameApp {

	public static void main(String[] args) {
		System.out.println("Game start ...");
		Scanner sc = new Scanner(System.in);
		double balance = 10000;

		while (true) {
			System.out.println("");
			System.out.println("Lotto Game ...");
			System.out.println("(m : Select Menu)");
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

				Dao dao = new LottoDao();
				
				System.out.println("How many Lotto do you want to buy? (Max 10): ");
				System.out.println("Balance : " + balance);
				String lows = sc.next();
				LottoVo wcode = dao.create();
				int n = 0;
				double b = 0;
				try {
					b = balance; 
					n = Integer.parseInt(lows);
					
					if (n > 10 || n < 1) {
						System.out.println("Min : 1, Max : 10");
						continue;
					}
					if (balance < n * 1000) {
						System.out.println("Not enough money");
						continue;
					}
					
					balance -= dao.minus(n);
					

					System.out.println("After purchase : " + balance);
					ArrayList<LottoVo> list;
					System.out.println("Lotto Number : " + wcode);
					int accord = 0;
					try {
						list = dao.create(n, b);

						for (int i = 0; i < n; i++) {
							LottoVo code = list.get(i);
							accord = dao.correct(wcode, code);
							double c = dao.plus(accord);
							balance += c;

							System.out.printf("Correct : %d \t (your number : ", accord);
							System.out.println(list.get(i) + ")");
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						continue;
					}
					
					if (balance <= 0) {
						System.out.println("\nGAME OVER ... ");
						sc.close();
						return;
					} // End if
					
					System.out.println("Current blance : "+balance);
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					continue;
				}

			}

			else if (cmd.equals("a")) {
				System.out.printf("Balance: %.0f \n", balance);
			}

			else if (cmd.equals("p")) {
				System.out.println("1st : 100,000,000");
				System.out.println("2nd : 10,000");
				System.out.println("3th : 5,000");
				
			}

		}
		sc.close();
		System.out.println("End ...");
	}

}
