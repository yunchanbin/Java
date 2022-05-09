package ws;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("start ...");
		MapDAO mapDao = new MapDAO();
		
		DAO dao = mapDao;
		
		Search search = mapDao;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Input cmd(c,r,u,d,s,a,q) ...");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}

			else if (cmd.equals("c")) {
				System.out.println("Create Product info ...");
				System.out.println("1. code :");
				String code = sc.next();
				System.out.println("2. ea :");
				String sea = sc.next();

				int ea = 0;
				try {
					ea = Integer.parseInt(sea);
				} catch (Exception e) {
					System.out.println("개수를 입력하세요");
					continue;
				}

				System.out.println("3. price :");
				String sprice = sc.next();
				double price = 0;
				try {
					price = Double.parseDouble(sprice);
				} catch (Exception e) {
					System.out.println("가격을 입력하세요");
					continue;
				}
				if(price <= 0) {
					System.out.println("가격은 0보다 커야 합니다.");
					continue;
				}

				ProductVO p = new ProductVO(code, ea, price);
				dao.create(p);
			}

			else if (cmd.equals("d")) {
				System.out.println("Input Product code :");
				String id = sc.next();
				dao.delete(id);
			}

			else if (cmd.equals("r")) {

				System.out.println("Input Product code :");
				String id = sc.next();
				ProductVO c = dao.read(id);
				System.out.println(c);
			}

			else if (cmd.equals("u")) {
				System.out.println("Update Product info ...");
				System.out.println("1. code :");
				String code = sc.next();
				System.out.println("2. ea :");
				int ea = sc.nextInt();
				System.out.println("3. price :");
				double price = sc.nextDouble();

				ProductVO p = new ProductVO(code, ea, price);
				dao.update(p);
			}

			else if (cmd.equals("a")) {
				ArrayList<ProductVO> list = dao.readAll();
				for (ProductVO p : list) {
					System.out.println(p);
				}
			}
			else if (cmd.equals("s")) {
				System.out.println("Min Price ...?");
				String sprice1 = sc.next();
				double price1 = 0;
				try {
					price1 = Double.parseDouble(sprice1);
				} catch (Exception e) {
					System.out.println("가격을 입력하세요");
					continue;
				}
				if(price1 <= 0) {
					System.out.println("가격은 0보다 커야 합니다.");
					continue;
				}
				System.out.println("Min Price ...?");
				String sprice2 = sc.next();
				double price2 = 0;
				try {
					price2 = Double.parseDouble(sprice2);
				} catch (Exception e) {
					System.out.println("가격을 입력하세요");
					continue;
				}
				if(price2 <= price1) {
					System.out.println("최대가격은 최소가격보다 커야 합니다.");
					continue;
				}
				
				ArrayList<ProductVO> list = search.search(price1, price2);
				for (ProductVO productVO : list) {
					System.out.println(productVO);
				}

			}

		}

		sc.close();
		System.out.println("End ...");

	}

}
