package task6;

public class Doctor extends Employee {
	
	private int workingNights;
	
	private int workingDays;

	public Doctor(int monthlyWorkingHours, float monthlySalary, int workingNights, int workingDays) {
		super(monthlyWorkingHours, monthlySalary);
		this.workingNights = workingNights;
		this.workingDays = workingDays;
	}

	public int getWorkingNights() {
		return workingNights;
	}

	public void setWorkingNights(int workingNights) {
		this.workingNights = workingNights;
	}

	public int getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}
	
}
