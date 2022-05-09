package p346;

public class TestApp {
	
	public static void main(String[] args) {
		OracleDAO oracleDao = new OracleDAO();
		
		DAO dao = oracleDao;
		
		CustomerVO c = new CustomerVO("id01", "pwd01", "lee");
		dao.insert(c);
		
		CustomerVO sc = dao.select("id01");
		System.out.println(sc);
	}
}
