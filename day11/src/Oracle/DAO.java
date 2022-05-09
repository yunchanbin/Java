package Oracle;

import java.util.ArrayList;



public interface DAO {

	public default void connect() {
		System.out.println("Connect ....");
	}

	public default void close() {
		System.out.println("Close ....");
	}
	
	public void insert(CustomerVO c) throws DuplicatedIDException;	//DuplicatedID Exception

	public void update(CustomerVO c) throws NotFoundException;	// NotFoundException 
	
	public void delete(String id) throws NotFoundException;	// NotFoundException 

	public CustomerVO select(String id) throws NotFoundException;	// NotFoundException 

	public ArrayList<CustomerVO> select() throws NotFoundException;	// NotFoundException 

}