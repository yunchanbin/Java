package Oracle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class CustomerDAO implements DAO {

	HashMap<String, CustomerVO> map;

	public CustomerDAO() {
		map = new HashMap<String, CustomerVO>();
	}

	@Override
	public void insert(CustomerVO c) throws DuplicatedIDException {
		String id = c.getId();
		if (map.containsKey(id)) {
			throw new DuplicatedIDException("ID 중복");
		}
		map.put(id, c);
	}

	@Override
	public void update(CustomerVO c) throws NotFoundException {
		String id = c.getId();
		if (!map.containsKey(id)) {
			throw new NotFoundException(id + "를 찾을 수 없습니다.");
		}
		map.replace(id, c);
	}

	@Override
	public void delete(String id) throws NotFoundException {
		if (!map.containsKey(id)) {
			throw new NotFoundException(id + "를 찾을 수 없습니다.");
		}
		map.remove(id);
	}

	@Override
	public CustomerVO select(String id) throws NotFoundException {
		CustomerVO c = null;
		if (!map.containsKey(id)) {
			throw new NotFoundException(id + "를 찾을 수 없습니다.");
		}
		c = map.get(id);
		return c;
	}

	@Override
	public ArrayList<CustomerVO> select() throws NotFoundException {

		System.out.println("Oracle Selected ALL : ");
		Collection<CustomerVO> co1 = map.values();
		Iterator<CustomerVO> it = co1.iterator();

		ArrayList<CustomerVO> list = new ArrayList<>();

		if (map.size() == 0) {
			throw new NotFoundException("비어있습니다.");
		}
		while (it.hasNext()) {
			CustomerVO cust = it.next();
			list.add(cust);
		}
		return list;
	}

}
