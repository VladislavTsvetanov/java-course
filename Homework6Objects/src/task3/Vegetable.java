package task3;

public class Vegetable extends Stock {
	
	private boolean fresh;

	public Vegetable(float price, boolean available, boolean fresh) {
		super(price, available);
		this.fresh = fresh;
	}

	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	
}
