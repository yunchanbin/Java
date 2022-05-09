package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import frame.Dao;
import frame.Sql;
import vo.CustVo;

public class CustDao extends Dao<String, CustVo> {

	@Override
	public void insert(CustVo v) throws Exception {
		// Connection 
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.insertCust);
			ps.setString(1, v.getId());
			ps.setString(2, v.getPwd());
			ps.setString(3, v.getName());
			ps.executeUpdate();
		}catch(Exception e) {
			throw new Exception("사용자 입력 오류");
		}finally {
			close(ps);
			close(con);
		}
	}

	@Override
	public void update(CustVo v) throws Exception {
		// Connection 
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.updateCust);
			ps.setString(1, v.getPwd());
			ps.setString(2, v.getName());
			ps.setString(3, v.getId());
			ps.executeUpdate();
		}catch(Exception e) {
			throw e;
		}finally {
			close(ps);
			close(con);
		}		
	}

	@Override
	public void delete(String k) throws Exception {
		// Connection 
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.deleteCust);
			ps.setString(1, k);
			int result = ps.executeUpdate();
			
			if(result != 1) {
				throw new Exception("삭제할 항목이 없습니다.");
			}
			
		}catch(Exception e) {
			throw e;
		}finally {
			close(ps);
			close(con);
		}		
	}

	@Override
	public CustVo select(String k) throws Exception {
		CustVo cust = null;
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectCust);
			ps.setString(1, k);
			rs = ps.executeQuery();
			rs.next();
			String id = rs.getString("id");
			String pwd = rs.getString("pwd");
			String name = rs.getString("name");
			cust = new CustVo(id, pwd, name);
		}catch(Exception e) {
			throw e;
		}finally {
			close(rs);
			close(ps);
			close(con);
		}		
		return cust;
	}

	@Override
	public List<CustVo> select() throws Exception {
		List<CustVo> list = new ArrayList<CustVo>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectAllCust);
			rs = ps.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				CustVo cust = new CustVo(id, pwd, name);
				list.add(cust);
			}
		}catch(Exception e) {
			throw e;
		}finally {
			close(rs);
			close(ps);
			close(con);
		}	
		
		return list;
	}

}











