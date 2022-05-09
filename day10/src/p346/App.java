package p346;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("start ...");
		OracleDAO oracleDao = new OracleDAO();
		// CRUD
		DAO dao = oracleDao;
		// Search
		Search search = oracleDao;
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Input cmd(i,d,u,s,a,q) ...");
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
			
			else if (cmd.equals("c")) {
				System.out.println("Input Customer name : ");
				String name = sc.next();
				ArrayList<CustomerVO> list = search.search(name);
				for (CustomerVO c : list) {
					System.out.println(c);
				}
			}
			
			else if (cmd.equals("s")) {

				System.out.println("Input Customer id :");
				String id = sc.next();
				CustomerVO c = dao.select(id);
				System.out.println(c);

			}

			else if (cmd.equals("a")) {
				ArrayList<CustomerVO> list = dao.select();
				for (CustomerVO c : list) {
					System.out.println(c);
				}
			}
			
			else if(cmd.equals("u")) {
				System.out.println("Insert Customer info ...");
				System.out.println("1. id :");
				String id = sc.next();
				System.out.println("2. pwd :");
				String pwd = sc.next();
				System.out.println("3. name :");
				String name = sc.next();
				
				dao.delete(id);
				CustomerVO c = new CustomerVO(id, pwd, name);
				dao.insert(c);
			}

		}

		sc.close();
		System.out.println("End ...");
	}

}
