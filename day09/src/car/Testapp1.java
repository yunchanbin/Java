package car;

public class Testapp1 {

	public static void main(String[] args) {	
		Car car1 = new Ice("k5","1234",10.0,"red",100,100);
		System.out.println(car1);
		
		car1.go(900);
		System.out.println(car1.getCfsize());
		
		car1.ff(70);
		System.out.println(car1.getCfsize());
		
		Car car2 = new Phev("Tu", "1123", 20, "blue", 50, 50, 20, 20);
		System.out.println(car2);
		

		if (car2 instanceof Phev) {
			Phev p = (Phev)car2;
			p.setMod(false);
		}
		System.out.println(car2);
		
		car2.go(200);
		
		if (car2 instanceof Phev) {
			Phev p = (Phev)car2;
			System.out.println(p.isMod());
		}
		
		car2.changeMod();
		
		if (car2 instanceof Phev) {
			Phev p = (Phev)car2;
			System.out.println(p.isMod());
		}
		
	
	
	}

}
