package task1;

public abstract class Lecturer extends Person implements HomeworkChecker {

	protected String university;
	
	public Lecturer() {
		super();
		this.university = "unknown";
	}
	
	public Lecturer(String university, String firstName, String lastName, int age, int workingYears) {
		super(firstName, lastName, age, workingYears);
		this.university = university;
	}

	public void performExercise() {
		performExercise("unknown", university);
	}
	
	public void performExercise(String subject) {
		performExercise(subject, university);
	}
	
	public void performExercise(String subject, String university) {
		System.out.println("Performing " + subject + " exercise in " + university);
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
	
	@Override
	public void checkHomework() {
		System.out.println("Checking university homework");
	}
	
}
