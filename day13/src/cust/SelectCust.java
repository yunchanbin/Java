package cust;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectCust {

	public static void main(String[] args) {
		// JDBC(Java Database Connectivity) Program

		// 변수 선언
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM CUST WHERE id = ?";

		// MySQL JDBC Driver Loading
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL JDBC Driver Loading ... ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// MySQL Connect
		String url = "jdbc:mysql://localhost:3306/shopdb?serverTimezone=Asia/Seoul";
		String mid = "admin1";
		String mpwd = "111111";
		try {
			con = DriverManager.getConnection(url, mid, mpwd);
			System.out.println("MySQL Server Connected ... ");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// SQL을 이용한 요청
		try {
			ps = con.prepareStatement(sql);
			

			// 요청 결과를 확인
			rs = ps.executeQuery(); // 가져올 때는 executeQuery()
			while(rs.next()) { // 한줄 위를 가리키고 있기 때문에 한줄 내려서 끄집어낼 수 있다.
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				System.out.println(id + " " + pwd + " " + name);
			
			}

			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// Close
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
