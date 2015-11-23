package homework1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	 String name;
	 String surname;
	 int age;
	 char gender;
	 String egn;
	 String phone;
		
		System.out.println("Enter name:");
		name = sc.next();
		
		System.out.println("Enter surname:");
		surname = sc.next();
		
		do{
		System.out.println("Enter age:");
		age = sc.nextInt();
		} while(age <= 0 || age > 120);
			
		System.out.println("Enter gender:");
		gender = sc.next().charAt(0);
		
		System.out.println("Enter egn:");
		egn = sc.next();
		
		System.out.println("Enter phone:");
		phone = sc.next();

		System.out.print("Name:");
		System.out.println(name);
		
		System.out.print("Surname:");
		System.out.println(surname);
		
		System.out.print("Age:");
		System.out.println(age);
		
		System.out.print("Gender:");
		System.out.println(gender);
		
		System.out.print("EGN:");
		System.out.println(egn);
		
		System.out.print("Phone:");
		System.out.println(phone);
		
	}

}
