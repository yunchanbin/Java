package p496;

public class StringTest {

	public static void main(String[] args) {
		String str = "abcdef ";
		
		char c = str.charAt(3);
		System.out.println(c);
		
		int i = str.indexOf('c');
		System.out.println(i);
		
		String str2 = str.substring(1,3);
		System.out.println(str2);
		
		String str3 = str.trim();
		System.out.println(str3);
		
		char cs[] = str.toCharArray();
		for (char d : cs) {
			System.out.println(d);
		}
		
		String ss = "1,2,3,4,5";
		String result[] = ss.split(","); //해당 문자를 기준으로 잘라내기(배열로 들어간다)
		
		for (String st : result) {
			System.out.println(st);
		}
		
		
	}

}
