package task1;

public class SchoolTeacher extends Teacher {

	private String[] classes = new String[5];

	public SchoolTeacher(String firstName, String lastName, int age, int workingYears, String subject,
			int maxWorkingHours, String ... classes) {
		super(firstName, lastName, age, workingYears, subject, maxWorkingHours);
		
		for (int i = 0; i < classes.length && i < 5; i++) {
			this.classes[i] = classes[i];
		}
	}
	
	public void printClasses() {
		System.out.println("Classes");
		
		for (int i = 0; i < classes.length; i++) {
			if (classes[i] != null) {
				System.out.print(classes[i] + " ");
			}
		}
		
		System.out.println();
	}
	
	public void entertainChildren() {
		System.out.println("Entertain children");
	}
	
}
