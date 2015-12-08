package task6;

public class Employee {
	
	private int monthlyWorkingHours;
	
	private float monthlySalary;

	public Employee(int monthlyWorkingHours, float monthlySalary) {
		super();
		this.monthlyWorkingHours = monthlyWorkingHours;
		this.monthlySalary = monthlySalary;
	}

	public int getMonthlyWorkingHours() {
		return monthlyWorkingHours;
	}

	public void setMonthlyWorkingHours(int monthlyWorkingHours) {
		this.monthlyWorkingHours = monthlyWorkingHours;
	}

	public float getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(float monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
}
