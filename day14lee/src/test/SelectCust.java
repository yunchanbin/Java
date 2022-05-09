package test;

import dao.CustDao;
import frame.Dao;
import vo.CustVo;

public class SelectCust {

	public static void main(String[] args) {
		Dao<String,CustVo> dao = new CustDao();
		CustVo cust = null;
		try {
			cust = dao.select("id45");
			System.out.println(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}




