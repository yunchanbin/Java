package p496;

public class StringBufferTest {

	public static void main(String[] args) {
		//String은 변경할 수 없다.(새로운 String으로 만들어지기 때문에 메모리 낭비)
		//StringBuffer는 변경 가능. 그 안에다 덮어쓸 수 있음. (단, 기능이 제한적임)
		
		StringBuffer sb = new StringBuffer("abcdef");
		sb.append("ghi");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(2, 3);
		System.out.println(sb);
		
		
	}

}
