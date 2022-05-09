package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import frame.Dao;
import frame.Sql;
import vo.ProductVo;

public class ProductDao extends Dao<Integer, ProductVo> {

	@Override
	public void insert(ProductVo v) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.insertProduct);
			ps.setString(1, v.getName());
			ps.setInt(2, v.getPrice());
			ps.setDouble(3, v.getRate());
			ps.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(ps);
			close(con);
		}
		
	}

	@Override
	public void update(ProductVo v) throws Exception {
		ProductVo p = null;
		
	}

	@Override
	public void delete(Integer k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select(Integer k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductVo> selest(ProductVo v) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
