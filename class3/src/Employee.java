public class Employee {
	private String name;
	private int monthlySalary;
	
	public Employee(String name, int monthlySalary) {
		this.name = name;
		this.monthlySalary = monthlySalary;
	}
	public double getMonthlySalary() { 
		return monthlySalary; 
	}
	public double earnsInYear() {
		return monthlySalary * 12;
	}
	public String toString() {
		return String.format("%s Earns %.1f", 
				name, earnsInYear());
	}
}
