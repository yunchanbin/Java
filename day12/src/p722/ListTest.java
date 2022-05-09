package p722;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add(2, "e");
		
		for (String s : list) {
			System.out.println(s);
		}
		
	}

}
