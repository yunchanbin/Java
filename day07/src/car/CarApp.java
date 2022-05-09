package car;

import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		System.out.println("start ...");
		Scanner sc = new Scanner(System.in);
		Car car = null; //referance type 의 초기화
		
		
 		while(true) {
			System.out.println("Input cmd(c,a,s,g,t,q) ...");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if(cmd.equals("a")) {
				System.out.println("A : Input How much ...?");
				double fs = Double.parseDouble(sc.next());
				car.setCfsize(fs);
				
			}else if(cmd.equals("c")) {
				System.out.println("C : Input name ...");
				String name = sc.next();
				System.out.println("C : Input fsize ...");
				double fsize = Double.parseDouble(sc.next());
				System.out.println("C : Input fuel effitioncy ...");
				double fe = Double.parseDouble(sc.next());
				System.out.println(fe);
				
				car = new Car(name, fsize, fe);		//자동차 생성
				System.out.println(car);
				
			}else if(cmd.equals("s")) {
				System.out.println(car);
				
			}else if(cmd.equals("g")) {
				System.out.println("G : Input km ...");
				double km = Double.parseDouble(sc.next());
				car.go(km);
				
			}else if(cmd.equals("t")) {
				car.stop();
			}
		}
		
		sc.close();
		System.out.println("End ...");
	}

}
