package test;

import frame.Dao;
import vo.CustVo;

public class InsertCust {

	public static void main(String[] args) {
		Dao<String, CustVo> dao = null;
		
		CustVo cust = new CustVo("id77", "pwd77", "이말숙");
		try {
			dao.insert(cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
