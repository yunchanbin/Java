package graphic2;

public class Rectangle extends Shape {

	private int width;
	private int height;
	
	public Rectangle() {
			}

	public Rectangle(int x, int y) {
		super(x, y);
			}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", x=" + x + ", y=" + y + "]";
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getCircum() {
		return (width+height) * 2;
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		
	}

}
