public class Employee {
	private String name;
	private long id;
	private int salary;
	
	public Employee(String name, long id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String toString() {
		return String.format("%s(%d) Earns %d", id, salary);
	}
}
