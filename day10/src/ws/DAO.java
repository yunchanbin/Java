package ws;

import java.util.ArrayList;

public interface DAO {
	
	public void create(ProductVO p);
	public ProductVO read(String code);
	public void update(ProductVO p);
	public void delete(String code);
	public ArrayList<ProductVO> readAll();
	
}