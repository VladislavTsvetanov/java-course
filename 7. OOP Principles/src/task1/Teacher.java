package task1;

public abstract class Teacher extends Person implements HomeworkChecker {

	protected String subject;
	
	protected final int maxWorkingHours;

	public Teacher() {
		super();
		subject = "";
		maxWorkingHours = 10;
	}

	public Teacher(String firstName, String lastName, int age, int workingYears, String subject, int maxWorkingHours) {
		super(firstName, lastName, age, workingYears);
		this.subject = subject;
		this.maxWorkingHours = maxWorkingHours;
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
	
	public void sayGoodBye() {
		System.out.println("Good bye");
	}
	
	@Override
	public void checkHomework() {
		System.out.println("Checking homework");
	}

}
