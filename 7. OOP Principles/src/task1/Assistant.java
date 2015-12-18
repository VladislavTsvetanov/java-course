package task1;

public class Assistant extends Lecturer {
	
	public enum AssistantTitle {
		titleAssistant,
		titleGeneralAssistant
	}
	
	private AssistantTitle title;

	public Assistant() {
		super();
		title = AssistantTitle.titleAssistant;
	}

	public Assistant(AssistantTitle title, String university, String firstName, String lastName, int age, int workingYears) {
		super(university, firstName, lastName, age, workingYears);
		this.title = title;
	}
	
	public boolean isGeneralAssistant() {
		return title == AssistantTitle.titleGeneralAssistant;
	}
	
	public void printInfo() {
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("General assistent: " + isGeneralAssistant());
	}
	
	public void checkExam() {
		System.out.println("Checking exam");
	}
	
}
