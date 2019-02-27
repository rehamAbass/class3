public class CommissionEmployee extends Employee {
	private double percent;
	private double sales;
	
	public CommissionEmployee(String name, long id, int salary, double percent) {
		super(name, id, salary);
		this.percent = percent;
	}
	public void setSales(double sales) {
		this.sales = sales;
	}
	@Override 
	public double earnings() {
		return percent * sales + super.earnings();
	}
}
