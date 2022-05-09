package car;

public abstract class Car {
	protected String name;
	protected String no;
	protected double fe;
	protected String color;
	protected double fsize;
	protected double cfsize;
	public Car() {
	}
	public Car(String name, String no, double fe, String color, double fsize, double cfsize) {
		this.name = name;
		this.no = no;
		this.fe = fe;
		this.color = color;
		this.fsize = fsize;
		this.cfsize = cfsize;
	}
	public Car(String name, String no, double fe, String color, double fsize) {
		this.name = name;
		this.no = no;
		this.fe = fe;
		this.color = color;
		this.fsize = fsize;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public double getFe() {
		return fe;
	}
	public void setFe(double fe) {
		this.fe = fe;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getFsize() {
		return fsize;
	}
	public void setFsize(double fsize) {
		this.fsize = fsize;
	}
	public double getCfsize() {
		return cfsize;
	}
	public void setCfsize(double cfsize) {
		this.cfsize = cfsize;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", no=" + no + ", fe=" + fe + ", color=" + color + ", fsize=" + fsize + ", cfsize="
				+ cfsize + "]";
	}
	public abstract void go(double km);
	
	public abstract void ff(double amount);
	public abstract void ff(double amount, boolean fmod);
	public abstract double ddistance(); 
	
	public abstract void changeMod();
	
}
