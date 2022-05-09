package p654;

public class BoxTest {

	public static void main(String[] args) {
		Box<ItemVO> box = new Box<ItemVO>();
		//c
		//box.setBox(new CustomerVO("id02", "pwd02","kim"));
		box.setBox(new ItemVO(100, "pants", 10000));
		
		ItemVO item = box.getBox();
		System.out.println(item);
		
		Box<CustomerVO> box2 = new Box<CustomerVO>();
		box2.setBox(new CustomerVO("id01", "pwd01","lee"));
		
		CustomerVO item2 = box2.getBox();
		System.out.println(item2);
		
		
	}

}
