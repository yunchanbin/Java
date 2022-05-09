package app;

import java.util.ArrayList;
import java.util.Scanner;

import dao.CustomerDAO;
import dao.ProductDAO;
import exception.DuplicatedException;
import exception.NotFoundException;
import exception.RangeOverException;
import frame.DAO;
import frame.Parse;
import frame.Search;
import vo.ProductVO;

public class App {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		System.out.println("start ...");
		CustomerDAO custDao = new CustomerDAO();
		ProductDAO prodDao = new ProductDAO();

		DAO daoc = custDao;
		DAO daod = prodDao;
				
		Search searchc = custDao;
		Search searchd = prodDao;
		
		Parse pa = prodDao;

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
					ea = pa.parseInt(sea);
				} catch (NumberFormatException e1) {
					System.out.println(e1.getMessage());
					continue;
				}
				System.out.println("3. price :");
				String sprice = sc.next();
				double price = 0.0;
				try {
					price = pa.parseDouble(sprice);
				} catch (NumberFormatException e1) {
					System.out.println(e1.getMessage());
					continue;
				}

				ProductVO p = new ProductVO(code, ea, price);
				try {
					dao.create(p);
				} catch (DuplicatedException e) {
					System.out.println(e.getMessage());
				} catch (RangeOverException e) {
					System.out.println(e.getMessage());
				}
			}

			else if (cmd.equals("d")) {
				System.out.println("Input Product code :");
				String id = sc.next();
				try {
					dao.delete(id);
				} catch (NotFoundException e) {
					System.out.println(e.getMessage());
				}
			}

			else if (cmd.equals("r")) {

				System.out.println("Input Product code :");
				String id = sc.next();
				ProductVO c = null;
				try {
					c = dao.read(id);
				} catch (NotFoundException e) {
					System.out.println(e.getMessage());
				}
				System.out.println(c);
			}

			else if (cmd.equals("u")) {
				System.out.println("1. code :");
				String code = sc.next();
				System.out.println("2. ea :");
				String sea = sc.next();
				int ea = 0;
				try {
					ea = pa.parseInt(sea);
				} catch (NumberFormatException e1) {
					System.out.println(e1.getMessage());
					continue;
				}
				System.out.println("3. price :");
				String sprice = sc.next();
				double price = 0.0;
				try {
					price = pa.parseDouble(sprice);
				} catch (NumberFormatException e1) {
					System.out.println(e1.getMessage());
					continue;
				}

				ProductVO p = new ProductVO(code, ea, price);

				try {
					dao.update(p);
				} catch (NotFoundException e) {
					System.out.println(e.getMessage());
				} catch (RangeOverException e) {
					System.out.println(e.getMessage());
				}

			}

			else if (cmd.equals("a")) {
				ArrayList<ProductVO> list = null;
				try {
					list = dao.read();
					for (ProductVO p : list) {
						System.out.println(p);
					}
				} catch (NotFoundException e) {
					System.out.println(e.getMessage());
				}

			}

			else if (cmd.equals("s")) {
				System.out.println("Min Price ...?");
				String sprice1 = sc.next();
				double price1 = 0.0;
				try {
					price1 = pa.parseDouble(sprice1);
				} catch (NumberFormatException e2) {
					System.out.println(e2.getMessage());
					continue;
				}

				System.out.println("Max Price ...?");
				String sprice2 = sc.next();
				double price2 = 0.0;
				try {
					price2 = pa.parseDouble(sprice2);
				} catch (NumberFormatException e1) {
					System.out.println(e1.getMessage());
					continue;
				}

				ArrayList<ProductVO> list = null;

				try {
					list = search.search(price1, price2);
					for (ProductVO productVO : list) {
						System.out.println(productVO);
					}
				} catch (NotFoundException e) {
					System.out.println(e.getMessage());
				} catch (RangeOverException e) {
					System.out.println(e.getMessage());
				}

			}

		}

		sc.close();
		System.out.println("End ...");

	}

}
