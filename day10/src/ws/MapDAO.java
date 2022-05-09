package ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDAO implements DAO, Search {

	HashMap<String, ProductVO> map;

	public MapDAO() {
		map = new HashMap<String, ProductVO>();
	}

	@Override
	public void create(ProductVO p) {
		String key = p.getCode();
		map.put(key, p);
	}

	@Override
	public ProductVO read(String code) {
		ProductVO p = null;
		p = map.get(code);
		return p;
	}

	@Override
	public void update(ProductVO p) {
		map.replace(p.getCode(), p);
	}

	@Override
	public void delete(String code) {
		map.remove(code);
	}

	@Override
	public ArrayList<ProductVO> readAll() {
		System.out.println("   <List>   ");
		Collection<ProductVO> co1 = map.values();
		Iterator<ProductVO> it = co1.iterator();

		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		while (it.hasNext()) {
			ProductVO p = (ProductVO) it.next();
			list.add(p);
		}
		return list;
	}

	@Override
	public ArrayList<ProductVO> search(Double minprice, Double maxprice) {
		System.out.println("   <List>   ");
		Collection<ProductVO> co1 = map.values();
		Iterator<ProductVO> it = co1.iterator();

		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		while (it.hasNext()) {
			ProductVO p = it.next();
			if(p.getPrice() >= minprice || p.getPrice() <= maxprice) {
				list.add(p);
			}
		}
		return list;
	}
}
