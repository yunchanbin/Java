package frame;

import java.util.ArrayList;

import exception.NotFoundException;
import exception.RangeOverException;
import vo.CustomerVO;
import vo.ProductVO;

public interface Search {
	
	public ArrayList<CustomerVO> search(String name) throws NotFoundException;
	
	public ArrayList<ProductVO> search(Double minprice,Double maxprice) throws NotFoundException, RangeOverException;
	
}
