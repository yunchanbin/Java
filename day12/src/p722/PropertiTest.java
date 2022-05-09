package p722;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiTest {

	public static void main(String[] args) {
		Properties pr = new Properties();
		String path = PropertiTest.class.getResource("database.properties.md").getPath();
		
		try {
			pr.load(new FileReader(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = pr.getProperty("url");
		String id = pr.getProperty("id");
		String pwd = pr.getProperty("pwd");
		
		System.out.printf("%s, %s, %s", url, id, pwd);
		
		
		
		
	}

}
