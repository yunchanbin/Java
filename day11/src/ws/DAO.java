package ws;

import java.util.ArrayList;


public interface DAO {
	

	
	public void create(ProductVO p) throws DuplicatedException, RangeOverException;
	public ProductVO read(String code)throws NotFoundException;
	public void update(ProductVO p)throws NotFoundException, RangeOverException;
	public void delete(String code)throws NotFoundException;
	public ArrayList<ProductVO> read()throws NotFoundException;
	
}
