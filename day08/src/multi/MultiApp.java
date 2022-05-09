package multi;


public class MultiApp {

	public static void main(String[] args) {
		Employee e[] = new Employee[4];
		
		e[0] = new Employee("1", "kim", 1000);
		e[1] = new Secretary("2", "lee", 1000 ,"Lucas");
		e[2] = new Sales("3", "Park", 1000, 100, 50);
		e[3] = new Manager("4", "Yun", 1000, 400);
		
		
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
		

		


	}

}
