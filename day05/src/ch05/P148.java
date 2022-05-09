package ch05;

public class P148 {

	public static void main(String[] args) {
		String str = "abcde";
		
		int c = str.indexOf("c");
		System.out.println(c);
		
		String str2 = str.substring(0, 2);
		System.out.println(str2);
		
		String mail = "dbscksqls123@naver.com";
		// id와 domain을 출력하시오
		
		int m = mail.indexOf("@");
		int d = mail.indexOf(".");
		System.out.printf("%d  %d\n", m, d);
		
		
		String id = mail.substring(0, m);
		String domain = mail.substring(m+1, d);		
		
		System.out.printf("%s    %s \n", id, domain);
		
		String ss = "    abc   ";
		System.out.println(ss.trim());
	}

}
