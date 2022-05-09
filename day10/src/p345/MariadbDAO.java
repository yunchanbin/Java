package p345;

import java.util.ArrayList;

public class MariadbDAO implements DAO {

	@Override
	public void insert(CustomerVO c) {
		connect();
		System.out.println("Mariadb Insert : " + c);
		close();
	}

	@Override
	public void delete(String id) {
		connect();
		System.out.println("Mariadb Delete : " + id);
		close();
	}

	@Override
	public CustomerVO select(String id) {
		connect();
		System.out.println("Mariadb Selected : " + id);
		CustomerVO c = new CustomerVO("id01", "pwd01", "james");
		close();
		return c;
	}

	@Override
	public ArrayList<CustomerVO> select() {
		connect();
		System.out.println("Mariadb Selected ALL : ");
		ArrayList<CustomerVO> list = new ArrayList<>();
		list.add(new CustomerVO("id01","pwd01","james1"));
		list.add(new CustomerVO("id02","pwd02","james2"));
		list.add(new CustomerVO("id03","pwd03","james3"));
		close();
		return list;
	}

}
