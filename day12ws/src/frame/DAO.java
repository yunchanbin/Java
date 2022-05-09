package frame;

import java.util.ArrayList;

import exception.DuplicatedException;
import exception.NotFoundException;
import exception.RangeOverException;
import vo.ProductVO;


public interface DAO<K,V> {
	

	
	public void create(V value) throws DuplicatedException, RangeOverException;
	public V read(K key)throws NotFoundException;
	public void update(V value)throws NotFoundException, RangeOverException;
	public void delete(K key)throws NotFoundException;
	public ArrayList<V> read()throws NotFoundException;
	
}
