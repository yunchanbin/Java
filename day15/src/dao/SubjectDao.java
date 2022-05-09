package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import frame.Dao;
import frame.Sql;
import vo.SubjectVo;

public class SubjectDao extends Dao<Integer, SubjectVo> {

	@Override
	public void insert(SubjectVo v) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.insertSbj);
			ps.setInt(1, v.getCode());
			ps.setString(2, v.getSubject());
			ps.setString(3, v.getRoom());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Input Error");
		} finally {
			close(ps);
			close(con);
		}

	}

	@Override
	public void update(SubjectVo v) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.updateSbj);
			ps.setString(1, v.getSubject());
			ps.setString(2, v.getRoom());
			ps.setInt(3, v.getCode());
			ps.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(ps);
			close(con);
		}

	}

	@Override
	public List<SubjectVo> select() throws Exception {
		List<SubjectVo> list = new ArrayList<SubjectVo>();

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectAllSbj);
			rs = ps.executeQuery();
			while (rs.next()) {
				int code = rs.getInt("code");
				String subject = rs.getString("subject");
				String room = rs.getString("room");
				SubjectVo sbj = new SubjectVo(code, subject, room);
				list.add(sbj);
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
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.deleteSbj);
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
	public SubjectVo select(Integer k) throws Exception {
		SubjectVo sbj = null;

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectSbj);
			ps.setInt(1, k);
			rs = ps.executeQuery();
			rs.next();
			int code = rs.getInt("code");
			String subject = rs.getString("subject");
			String room = rs.getString("room");
			sbj = new SubjectVo(code, subject, room);
		} catch (Exception e) {
			throw e;
		} finally {
			close(rs);
			close(ps);
			close(con);
		}
		return sbj;
	}

}
