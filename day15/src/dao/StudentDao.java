package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import frame.Dao;
import frame.Sql;
import vo.StudentVo;

public class StudentDao extends Dao<Integer, StudentVo> {

	@Override
	public void insert(StudentVo v) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.insertStd);
			ps.setInt(1, v.getId());
			ps.setString(2, v.getName());
			ps.setInt(3, v.getScore());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Input Error");
		} finally {
			close(ps);
			close(con);
		}
	}

	@Override
	public void update(StudentVo v) throws Exception {
		// Connection
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.updateStd);
			ps.setString(1, v.getName());
			ps.setInt(2, v.getScore());
			ps.setInt(3, v.getId());
			ps.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(ps);
			close(con);
		}
	}

	@Override
	public List<StudentVo> select() throws Exception {
		List<StudentVo> list = new ArrayList<StudentVo>();

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectAllStd);
			rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int score = rs.getInt("score");
				StudentVo std = new StudentVo(id, name, score);
				list.add(std);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			close(rs);
			close(ps);
			close(con);
		}

		return list;
	}

	@Override
	public void delete(Integer k) throws Exception {
		// Connection
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.deleteStd);
			ps.setInt(1, k);
			int result = ps.executeUpdate();

			if (result != 1) {
				throw new Exception("Can't found 'id = " + k + "'");
			}

		} catch (Exception e) {
			throw e;
		} finally {
			close(ps);
			close(con);
		}

	}

	@Override
	public StudentVo select(Integer k) throws Exception {
		StudentVo std = null;

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectStd);
			ps.setInt(1, k);
			rs = ps.executeQuery();
			rs.next();
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int score = rs.getInt("score");
			std = new StudentVo(id, name, score);
		} catch (Exception e) {
			throw e;
		} finally {
			close(rs);
			close(ps);
			close(con);
		}
		return std;
	}

}
