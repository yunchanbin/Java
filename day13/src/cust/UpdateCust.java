package cust;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateCust {

	public static void main(String[] args) {
		// JDBC(Java Database Connectivity) Program
		
		// ���� ����
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "UPDATE CUST SET pwd=?, name=? WHERE id=?";
		
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
			con = DriverManager.getConnection(url,mid,mpwd);
			System.out.println("MySQL Server Connected ... ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// SQL�� �̿��� ��û
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, "11111");
			ps.setString(2, "������");
			ps.setString(3, "id11");
			// ��û ����� Ȯ�� 
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// Close
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
