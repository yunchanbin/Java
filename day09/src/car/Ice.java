package car;

public class Ice extends Car {

	public Ice() {
		// TODO Auto-generated constructor stub
	}

	public Ice(String name, String no, double fe, String color, double fsize, double cfsize) {
		super(name, no, fe, color, fsize, cfsize);
		// TODO Auto-generated constructor stub
	}

	public Ice(String name, String no, double fe, String color, double fsize) {
		super(name, no, fe, color, fsize);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void go(double km) {
		if (km > ddistance()) {
			System.out.println("연료가 모자랍니다.");
		}
		else {
			cfsize -= (km / fe);
		}
	}

	
	@Override
	public void ff(double amount) {
		if (fsize - cfsize < amount) {
			System.out.println("연료를 너무 많이 넣을 수 없습니다.");
		}
		else {
			cfsize += (amount);
		}
	}

	@Override
	public double ddistance() {
		// TODO Auto-generated method stub
		return cfsize*fe;
	}

	@Override
	public void ff(double amount, boolean fmod) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Ice [name=" + name + ", no=" + no + ", fe=" + fe + ", color=" + color + ", fsize=" + fsize + ", cfsize="
				+ cfsize + "]";
	}

	@Override
	public void changeMod() {
		
		
	}
	

}
