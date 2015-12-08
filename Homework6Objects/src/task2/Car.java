package task2;

import java.util.Arrays;
import java.util.Comparator;

public class Car {

	private float price;
	
	public Car(float price) {
		super();
		this.price = price;
	}

	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public static void main(String[] args) {
		
		Car[] cars = new Car[10];
		
		for (int i = 0; i < cars.length; i++) {
			if (i % 2 == 0) {
				cars[i] = new Automobile(10000 + (float)Math.random() * 50000f, (int)(Math.random() * 20));
			} else {
				cars[i] = new SUV((float)Math.random() * 50000f, (int)(Math.random() * 10) % 2 == 0);
			}
		}
		
		Arrays.sort(cars, new Comparator<Car>() {
			@Override
			public int compare(Car o1, Car o2) {
				return Float.compare(o1.getPrice(), o2.getPrice());
			}
		});
		
		for (Car car : cars) {
			System.out.println(car);
		}
		
	}

}
