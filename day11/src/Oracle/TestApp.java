package Oracle;

import java.util.ArrayList;

public class TestApp {

	public static void main(String[] args) {
		
		ArrayList<CustomerDAO> list = new ArrayList<CustomerDAO>();
		DAO dao = new CustomerDAO();
		
		CustomerVO c1 = new CustomerVO("id01","pwd01","lee");
		try {
			dao.insert(c1);
			System.out.println("Completed 1.. ");
			dao.insert(c1);
			System.out.println("Completed 2.. ");
		} catch(DuplicatedIDException e) {
			System.out.println(e.getMessage());
		}
		try {
			dao.delete("id02");
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}

		
		
	}

}
