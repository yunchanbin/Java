package dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import exception.DuplicatedException;
import exception.NotFoundException;
import exception.RangeOverException;
import frame.DAO;
import frame.Search;
import vo.CustomerVO;
import vo.ProductVO;

public class CustomerDAO implements DAO<String, CustomerVO>, Search {

	HashMap<String, CustomerVO> map;
	
	public CustomerDAO() {
		map = new HashMap<String, CustomerVO>();
	}
	
	@Override
	public ArrayList<CustomerVO> search(String name) throws NotFoundException {
		ArrayList<CustomerVO> list = new ArrayList<CustomerVO>();
		
		if (!map.containsKey(name)) {
			throw new NotFoundException("해당 Id를 찾을 수 없습니다.");
		}
		Collection<CustomerVO> col = map.values();
		Iterator<CustomerVO> it = col.iterator();
		
		while (it.hasNext()) {
			CustomerVO cust = it.next();
			if(cust.getName().equals(name)) {
				list.add(cust);
			}
		}
		return list;
	}

	@Override
	public ArrayList<ProductVO> search(Double minprice, Double maxprice) throws NotFoundException, RangeOverException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(CustomerVO c) throws DuplicatedException, RangeOverException {
		String id = c.getId();
		if (map.containsKey(id)) {
			throw new DuplicatedException("id중복");
		}
		map.put(id,c);
	}

	@Override
	public CustomerVO read(String id) throws NotFoundException {
		CustomerVO c = null;
		if (!map.containsKey(id)) {
			throw new NotFoundException("해당 Id를 찾을 수 없습니다.");
		}
		c = map.get(id);
		return c;
	}

	@Override
	public void update(CustomerVO c) throws NotFoundException, RangeOverException {
		String id = c.getId();
		if (!map.containsKey(id)) {
			throw new NotFoundException("해당 Id를 찾을 수 없습니다.");
		}
		map.replace(id,c);
	}

	@Override
	public void delete(String id) throws NotFoundException {
		if (!map.containsKey(id)) {
			throw new NotFoundException("해당 Id를 찾을 수 없습니다.");
		}
		map.remove(id);
	}

	@Override
	public ArrayList<CustomerVO> read() throws NotFoundException {
		ArrayList<CustomerVO> list = new ArrayList<CustomerVO>();
		
		if (map.size() == 0) {
			throw new NotFoundException("List가 비어있습니다.");
		}
		Collection<CustomerVO> col = map.values();
		Iterator<CustomerVO> it = col.iterator();
		
		while (it.hasNext()) {
			CustomerVO cust = it.next();
			list.add(cust);
		}
		return list;
	}



}
