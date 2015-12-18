package task1;

public class Professor extends Lecturer {
	
	private String title;
	
	public Professor() {
		super();
		this.title = "";
	}

	public Professor(String title, String university, String firstName, String lastName, int age, int workingYears) {
		super(university, firstName, lastName, age, workingYears);
		this.title = title;
	}

	public void printInfo() {
		System.out.println("Title: " + title);
		System.out.println("Working experience: " + workingYears);
	}
	
	public void performExam() {
		System.out.println("Performing exam");
	}

}
