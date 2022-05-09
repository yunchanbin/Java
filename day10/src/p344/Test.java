package p344;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// Collection API
		
		// CustomerVO cs[] = new CustomerVO[5];
		
		ArrayList<CustomerVO> list = new ArrayList<>();
		list.add(new CustomerVO("id01","pwd01","james1"));
		list.add(new CustomerVO("id02","pwd02","james2"));
		list.add(new CustomerVO("id03","pwd03","james3"));
	
		for (CustomerVO c : list) {
			System.out.println(c);
		}
		
		
	}

}
