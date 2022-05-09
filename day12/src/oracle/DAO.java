package oracle;

import java.util.ArrayList;



public interface DAO {

	public default void connect() {
		System.out.println("Connect ....");
	}

	public default void close() {
		System.out.println("Close ....");
	}
	
	//CustomerVO만을 위한 interface가 아니라, 어떤게 나오더라도 가능
	public void insert(Object obj) throws Exception;

	public void update(Object obj) throws Exception; 
	
	public void delete(Object obj) throws Exception;

	public Object select(Object obj) throws Exception;

	public ArrayList<Object> select() throws Exception;

}