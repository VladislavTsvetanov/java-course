package task1;

public abstract class Person {

	protected String firstName;
	
	protected String lastName;
	
	protected int age;
	
	protected int workingYears;
	
	private static int instancesCreated = 0;
	
	public Person() {
		this("", "", 0, 0);
	}

	public Person(String firstName, String lastName, int age, int workingYears) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.workingYears = workingYears;
		instancesCreated++;
	}
	
	public int getCreatedInstancesCount() {
		return instancesCreated;
	}
	
}
