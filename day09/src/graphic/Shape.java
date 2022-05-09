package graphic;

public abstract class Shape {
	protected int x;
	protected int y;
	
	public Shape() {
	}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
	
	
	
	//Abstract : 의미는 존재하지만 객체를 만들어 낼 순 없다.
	public abstract double getArea();	//넓이는 가지고 있지만 현재 정보들로 구할 순 없다... 추상적
	public abstract double getCircum();
	
}
