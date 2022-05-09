package p346;

import java.util.ArrayList;

public interface DAO {

	public default void connect() {
		System.out.println("Connect ....");
	}

	public default void close() {
		System.out.println("Close ....");
	}
	// CRUD
	public void insert(CustomerVO c);
	public void update(CustomerVO c);
	
	public void delete(String id);

	public CustomerVO select(String id);

	public ArrayList<CustomerVO> select();

}