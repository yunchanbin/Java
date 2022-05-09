package company;

public class Employee {
	private String id;
	private String name;
	protected double salary;
	
	public Employee() {
	}

	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
	
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public double annsalary() {
		return this.salary * 12;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
