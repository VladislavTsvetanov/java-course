package task6;

public class Policeman extends Employee {

	private String rank;

	public Policeman(int monthlyWorkingHours, float monthlySalary, String rank) {
		super(monthlyWorkingHours, monthlySalary);
		this.rank = rank;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
}
