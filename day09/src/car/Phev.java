package car;

public class Phev extends Car {
	
	
	
	private double capacity;
	private double ccapacity; 
	private boolean mod;
	
	
	public Phev(String name, String no, double fe, String color, double fsize, double cfsize, double capacity,
			double ccapacity) {
		super(name, no, fe, color, fsize, cfsize);
		this.capacity = capacity;
		this.ccapacity = ccapacity;
	}

	
	
	public Phev(String name, String no, double fe, String color, double fsize, double cfsize, double capacity,
			double ccapacity, boolean mod) {
		super(name, no, fe, color, fsize, cfsize);
		this.capacity = capacity;
		this.ccapacity = ccapacity;
		this.mod = mod;
	}



	public Phev() {
		// TODO Auto-generated constructor stub
	}

	public Phev(String name, String no, double fe, String color, double fsize, double cfsize) {
		super(name, no, fe, color, fsize, cfsize);
		// TODO Auto-generated constructor stub
	}

	public Phev(String name, String no, double fe, String color, double fsize) {
		super(name, no, fe, color, fsize);
		// TODO Auto-generated constructor stub
	}

	
	
	
	public double getCapacity() {
		return capacity;
	}



	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}



	public double getCcapacity() {
		return ccapacity;
	}



	public void setCcapacity(double ccapacity) {
		this.ccapacity = ccapacity;
	}



	public boolean isMod() {
		return mod;
	}



	public void setMod(boolean mod) {
		this.mod = mod;
	}


	

	@Override
	public void go(double km) {
		if(mod == true) {
			if (km > ddistance()) {
				System.out.println("연료 부족");
			}
			else {
				cfsize -= (km / fe);
			}
		}
		else if(mod == false) {
			if (km > ddistance()) {
				System.out.println("배터리 잔량 부족");
			}
			else {
				ccapacity -= (km / fe);
			}
		}

	}

	@Override
	public void ff(double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ff(double amount, boolean fmod) {
		if(mod == true) {
			if (fsize - cfsize < amount) {
				System.out.println("연료를 너무 많이 넣을 수 없습니");
			}
			else {
				cfsize += (amount);
			}
		}
		else if(mod == false) {
			if (capacity - ccapacity < amount) {
				System.out.println("과충전입니다");
			}
			else {
				ccapacity += (amount);
			}
		}
	}

	@Override
	public double ddistance() {
		double dd = 0.0;
		if(mod == true) {
			dd = cfsize*fe;
		}
		else if(mod == false) {
			dd = ccapacity*fe;
		}
		return dd;
		
	}



	@Override
	public String toString() {
		return "Phev [capacity=" + capacity + ", ccapacity=" + ccapacity + ", mod=" + mod + ", name=" + name + ", no="
				+ no + ", fe=" + fe + ", color=" + color + ", fsize=" + fsize + ", cfsize=" + cfsize + "]";
	}



	@Override
	public void changeMod() {
		if (this.mod == true) {	//만약 mod가 '내연기관'으로 설정 돼있으면
			mod = false;		//'전기' 모드로 바꿔라
		}else if(this.mod == false) {	//만약 mod가 '전기'로 설정돼있으면
			mod = true;					//'내연기관'모드로 바꿔
		}
	}
	
	
	
}
