package ws;

import java.util.ArrayList;

public interface Search {
	
	public ArrayList<ProductVO> search(Double minprice,Double maxprice);
	
}
