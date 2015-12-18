package task1;

import task1.Assistant.AssistantTitle;

public class Main {

	public static void main(String[] args) {
		
		SchoolTeacher schoolTeacher = new SchoolTeacher("Jennifer", "Johnson", 27, 3, "History", 20, "4A", "3B", "6B");
		schoolTeacher.printClasses();
		schoolTeacher.sayHello();
		schoolTeacher.entertainChildren();
		schoolTeacher.sayGoodBye();
		schoolTeacher.checkHomework();
		System.out.println("Person instances: " + schoolTeacher.getCreatedInstancesCount());
		System.out.println();
		
		CollegeTeacher collegeTeacher = new CollegeTeacher("Economic College - Sofia", "Ivan", "Ivanov", 57, 10, "Economics", 2);
		collegeTeacher.printCollege();
		collegeTeacher.sayHello();
		collegeTeacher.sayGoodBye();
		collegeTeacher.checkHomework();
		System.out.println("Person instances: " + collegeTeacher.getCreatedInstancesCount());
		System.out.println();
		
		Professor professor = new Professor("Professor", "UNWE - Sofia", "Georgi", "Georgiev", 67, 20);
		Assistant assistant = new Assistant(AssistantTitle.titleGeneralAssistant, "UNWE - Sofia", "Martin", "Martinov", 45, 10);
		assistant.sayHello();
		assistant.performExercise();
		assistant.checkExam();
		professor.sayHello();
		assistant.sayHello();
		professor.performExam();
		assistant.checkExam();
		System.out.println("Person instances: " + assistant.getCreatedInstancesCount());
	}

}
