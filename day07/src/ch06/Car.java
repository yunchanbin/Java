package ch06;

public class Car {
	// Attribute
	String name;
	String color;
	int size;
	int fsize;
	int cfsize;
	
	// Constructor : 생성자
	public Car() {
		
	}


	public Car(String name, String color, int size, int fsize, int cfsize) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.fsize = fsize;
		this.cfsize = cfsize;
	}




//	public Car() {
//		this.name = "K1";
//		this.color = "red";
//		this.size = 1000;
//		this.fsize = 50;
//		this.cfsize = 0;
//	}
//	public Car(String name, String color, int size, int fsize, int cfsize) {
//		this.name = "K1";
//		this.color = "red";
//		this.size = 1000;
//		this.fsize = 50;
//		this.cfsize = 0;
//	}
	
	// Operation
	public void go() {
		System.out.println("Go !");
	}
	


	public void stop() {
		System.out.println("Stop !");
	}

	public void addFuels(int f) {
		cfsize += f;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + ", fsize=" + fsize + ", cfsize=" + cfsize
				+ "]";
	}
	
	
	
}
