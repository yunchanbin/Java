package app;

import java.util.List;
import java.util.Scanner;

import dao.CustDao;
import frame.Dao;
import vo.CustVo;

public class App {

	public static void main(String[] args) {
		Dao<String, CustVo> dao = new CustDao();
		
		System.out.println("start ...");
		Scanner sc = new Scanner(System.in);
		
 		while(true) {
			System.out.println("Input cmd(i,s,q,l) ...");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}
			
			else if(cmd.equals("i")) {
				System.out.println("Insert : Input Customer Info ...");
				String id = sc.next();
				String pwd = sc.next();
				String name = sc.next();
				CustVo c = new CustVo(id,pwd,name);
				try {
					dao.insert(c);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			else if(cmd.equals("s")) {
				System.out.println("Select ALL ...");
				List<CustVo> list = null;
				
				try {
					list = dao.select();
					for (CustVo cust : list) {
						System.out.println(cust);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			else if(cmd.equals("l")) {
				System.out.println("Login ...");
				System.out.println("Input id ...");
				String id = sc.next();
				System.out.println("Input pwd ...");
				String pwd = sc.next();
				CustVo c = null;
				try {
					c = dao.select(id);
					if(c.getPwd().equals(pwd)) {
						System.out.println("Login OK");
					}else {
						throw new Exception();
					}
					
				} catch (Exception e) {
					System.out.println("Login Fail ...");
				}
				
				
				
			}
		}
		
		sc.close();
		System.out.println("End ...");
	}

}
