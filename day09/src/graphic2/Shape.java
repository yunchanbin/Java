package graphic2;

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
	
	//추상클래스에도 일반 함수를 정의해서 하위 함수에서 쓸 수 있다.
	public String getPosition() {
		return x + " , " + y;
	}
	
	//Abstact : 의미는 존재하지만 객체를 만들어 낼 순 없다.
	public abstract double getArea();	//넓이는 가지고 있지만 현재 정보들로 구할 순 없다... 추상적
	public abstract double getCircum();
	public abstract void setColor(String color);
}
