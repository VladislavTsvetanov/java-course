package task2;

public class SUV extends Car {
	
	private boolean offroad;
	
	public SUV(float price, boolean offroad) {
		super(price);
		this.offroad = offroad;
	}

	public void setOffroad(boolean offroad) {
		this.offroad = offroad;
	}
	
	public boolean isOffroad() {
		return offroad;
	}
	
	@Override
	public String toString() {
		return "SUV [Price: " + getPrice() + "] [Offroad: " + (offroad ? "Yes" : "No") + "]";
	}
	
}
