package task3;

public abstract class Stock {
	
	private float price;
	
	private boolean available;

	public Stock(float price, boolean available) {
		super();
		this.price = price;
		this.available = available;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
}
