package task1;

public class CollegeTeacher extends Teacher {

	private String college;
	
	public CollegeTeacher(String college, String firstName, String lastName, int age, int workingYears, String subject,
			int maxWorkingHours) {
		super(firstName, lastName, age, workingYears, subject, maxWorkingHours);
		this.college = college;
	}

	public void writeScienceArticle() {
		System.out.println("Writing science article");
	}
	
	public void printCollege() {
		System.out.println("College: " + college);
	}
	
}
