package ch06;

public class Car {
	//필드
	private String name;
	private String color;
	private int size;
	private int serial;
	
	//class의 유일한 변수
	static int cnt = 1000;
	
	
	
	public Car() {
	}

	public Car(String name) {
		this(name, "red", 1000);	// 이름만 넣어주면red와 1000은 디폴트로 가져온다.
	}

	public Car(String name, String color) {
		this(name, color, 1000);
	}

	public Car(String name, String color, int size) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.serial = cnt;
		cnt++;
	}



	public Car(String name, String color, int size, int serial) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.serial = serial;
	}

	public int getSize() {
		return size;		//파란색 size는 this. 이 생략된 것.
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getSerial() {
		return serial;
	}

	
	
	
	public void go() {
		System.out.println(this.name + ": GO !!!! ");
	}
	
	public void go(int a) {
		System.out.println(this.name + ": GO !!!! " + a);
	}

	public void go(double b) {
		System.out.println(this.name + ": GO !!!! " + b);
	}
	
	
	
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + ", serial=" + serial + "]";
	}
	
	
	
	
	
	
}
