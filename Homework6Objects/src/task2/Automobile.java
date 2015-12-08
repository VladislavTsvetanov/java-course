package task2;

public class Automobile extends Car {
	
	private int consumption;
	
	public Automobile(float price, int consumption) {
		super(price);
		this.consumption = consumption;
	}

	public void setConsumption(int consumption) {
		this.consumption = consumption;
	}
	
	public int getConsumption() {
		return consumption;
	}
	
	@Override
	public String toString() {
		return "Car [Price: " + getPrice() + "] [Consumtion: " + consumption + "]";
	}

}
