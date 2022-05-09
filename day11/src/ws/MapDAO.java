package ws;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDAO implements DAO, Search, Parse {

	HashMap<String, ProductVO> map;

	public MapDAO() {
		map = new HashMap<String, ProductVO>();
	}

	@Override
	public void create(ProductVO p) throws DuplicatedException, RangeOverException {
		String key = p.getCode();
		if (map.containsKey(key)) {
			throw new DuplicatedException("제품코드 중복");
		} else if (p.getEa() <= 0) {
			throw new RangeOverException("수량은 0보다 커야 합니다.");
		} else if (p.getPrice() <= 0) {
			throw new RangeOverException("가격은 0보다 커야 합니다.");
		}
		map.put(key, p);
	}

	@Override
	public ProductVO read(String code) throws NotFoundException {
		ProductVO p = null;
		if (!map.containsKey(code)) {
			throw new ws.NotFoundException("제품코드 : " + code + "인 제품을 찾을 수 없습니다.");
		}
		p = map.get(code);
		return p;
	}

	@Override
	public void update(ProductVO p) throws NotFoundException, RangeOverException {
		String getCode = p.getCode();
		if (!map.containsKey(getCode)) {
			throw new NotFoundException("제품코드 : " + getCode + "인 제품을 찾을 수 없습니다.");
		} else if (p.getEa() <= 0) {
			throw new RangeOverException("수량은 0보다 커야 합니다.");
		} else if (p.getPrice() <= 0) {
			throw new RangeOverException("가격은 0보다 커야 합니다.");
		}
		map.replace(getCode, p);
	}

	@Override
	public void delete(String code) throws NotFoundException {
		if (!map.containsKey(code)) {
			throw new NotFoundException("제품코드 : " + code + "인 제품을 찾을 수 없습니다.");
		}
		map.remove(code);
	}

	@Override
	public ArrayList<ProductVO> read() throws NotFoundException {
		System.out.println("   <List>   ");
		Collection<ProductVO> co1 = map.values();
		Iterator<ProductVO> it = co1.iterator();

		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		if (map.size() == 0) {
			throw new NotFoundException("제품이 없습니다.");
		}
		while (it.hasNext()) {
			ProductVO p = (ProductVO) it.next();
			list.add(p);
		}
		return list;
	}

	@Override
	public ArrayList<ProductVO> search(Double minprice, Double maxprice)
			throws RangeOverException {
		System.out.println("   <List>   ");
		Collection<ProductVO> co1 = map.values();
		Iterator<ProductVO> it = co1.iterator();

		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		if (minprice <= 0) {
			throw new RangeOverException("가격은 0보다 커야 합니다.");
		} else if (maxprice <= minprice) {
			throw new RangeOverException("MAX는 MIN보다 작을 수 없니다.");
		}
		while (it.hasNext()) {
			ProductVO p = it.next();
			if (p.getPrice() >= minprice || p.getPrice() <= maxprice) {
				list.add(p);
			}
		}
		return list;
	}

	@Override
	public int parseInt(String s) throws NumberFormatException {
		int n = 0;
			try {	
				n = Integer.parseInt(s);
			} catch(Exception e) {
				throw new NumberFormatException("개수는 정수로 입력하세요.");
			}
		return n;
	}

	@Override
	public double parseDouble(String s) throws NumberFormatException {
		double n = 0;
		try {	
			n = Double.parseDouble(s);
		} catch(Exception e) {
			throw new NumberFormatException("가격은 실로 입력하세요.");
		}
	return n;
	}
}
