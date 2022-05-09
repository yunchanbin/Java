package p344;

import java.util.ArrayList;

public class OracleDAO {

	public void connect() {
		System.out.println("Oracle Server Connected ...");
	}

	public void close() {
		System.out.println("Oracle Server Closed ...");
	}
	
	public void insert(CustomerVO c) {
		connect();
		System.out.println(c);
		System.out.println("Inserted ...");
		close();
	}
	public void delete(String id) {
		connect();
		System.out.println(id);
		System.out.println("Delete ...");
	}
	public CustomerVO select(String id) {
		connect();
		String pwd = "pwd01";
		String name = "james";
		CustomerVO c = new CustomerVO(id, pwd, name);
		close();
		return c;
	}
	public ArrayList<CustomerVO> select() {
		connect();
		ArrayList<CustomerVO> list = new ArrayList<>();
		list.add(new CustomerVO("id01","pwd01","james1"));
		list.add(new CustomerVO("id02","pwd02","james2"));
		list.add(new CustomerVO("id03","pwd03","james3"));
		close();
		return list;
	}
	
	
}
