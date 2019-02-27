public class Employee {
	private String name;
	private int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public double earnings() {
		return salary;
	}
	public String toString() {
		return String.format("%s Earns %d", 
				name, earnings());
	}
}
