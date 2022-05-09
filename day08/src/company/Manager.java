package company;

public class Manager extends Employee{	//constructor만 제외하고 전부 상속받음.
	
	private double bonus;

	public Manager() {
	}

	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", toString()=" + super.toString() + "]";
	}
	public double getBonusTex() {
		double tex = 0.0;
		tex = this.bonus *(1 - 1.1);
		return tex;
	}
	
	
	// 재정의 - overriding : 상위의 함수를 다시 정의해서 사용하는 것
	@Override
	public double annsalary() {
		double sum = 0.0;
		//sum = salary * 12 + this.bonus;	//상속 관계에 있을 때 salary를 들고 오는 법. (private면 get으로 들고 오고 protected로 선언하면 바로 가져올 수 있다.
		sum = super.annsalary() + this.bonus;
		return sum;
	}
	
	
	
	
	
	
	
	
	
}
