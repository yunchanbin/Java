package multi;



public class Secretary extends Employee{
	private String boss;

	public Secretary() {
	}
	
	public Secretary(String id, String name, double salary, String boss) {
		super(id, name, salary);
		this.setBoss(boss);
	}

	public String getBoss() {
		return boss;
	}

	public void setBoss(String boss) {
		this.boss = boss;
	}
	
	public double incentive(double ict) {
		double cash = (ict * 0.6);
		return cash;
	}
	
	
}
