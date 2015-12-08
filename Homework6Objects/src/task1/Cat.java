package task1;

public class Cat {
	
	private String name;
	
	private int age;
	
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void say() {
		System.out.println("Name: " + name + " Age: " + age);
	}

	public static void main(String[] args) {
		Cat[] cats = new Cat[10];
		
		for (int i = 0; i < cats.length; i++) {
			cats[i] = new Cat("Cat_" + i, 5 + i);
		}
		
		for (Cat cat : cats) {
			cat.say();
		}
	}
}