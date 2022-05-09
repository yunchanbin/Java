package p345;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("start ...");
		DAO dao = new OracleDAO(); 
		//DAO dao = new MariadbDAO();
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Input cmd(i,d,s,a,q) ...");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}

			else if (cmd.equals("i")) {
				System.out.println("Insert Customer info ...");
				System.out.println("1. id :");
				String id = sc.next();
				System.out.println("2. pwd :");
				String pwd = sc.next();
				System.out.println("3. name :");
				String name = sc.next();

				CustomerVO c = new CustomerVO(id, pwd, name);
				dao.insert(c);
			}

			else if (cmd.equals("d")) {
				System.out.println("Input Customer id :");
				String id = sc.next();
				dao.delete(id);
			}

			else if (cmd.equals("s")) {

				System.out.println("Input Customer id :");
				String id = sc.next();
				CustomerVO c = dao.select(id);
				System.out.println(c);

			}

			else if (cmd.equals("a")) {
				ArrayList<CustomerVO> list = dao.select();
				System.out.println(list);
				for (CustomerVO c : list) {
					System.out.println(c);
				}
			}

		}

		sc.close();
		System.out.println("End ...");
	}

}
