package multi;



public class Sales extends Employee{
	private double goal;
	private double target;
	public Sales() {
	}
	public Sales(String id, String name, double salary, double goal, double target) {
		super(id, name, salary);
		this.goal = goal;
		this.target = target;
	}
	public double getGoal() {
		return goal;
	}
	public void setGoal(double goal) {
		this.goal = goal;
	}
	public double getTarget() {
		return target;
	}
	public void setTarget(double target) {
		this.target = target;
	}
	
	public double incentive(double ict,double goal, double target) {
		double cash = ict * (target/goal);
		return cash;
	}
	
	
}
