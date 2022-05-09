package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
		} catch (Exception e) {
			throw e;
		} finally {
			close(ps);
			close(con);
		}

	}

	@Override
	public void update(CustVo v) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String k) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void select(String k) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<CustVo> selest(CustVo v) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
