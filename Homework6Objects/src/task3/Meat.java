package task3;

import java.util.Date;

public class Meat extends Stock {

	private String type;
	
	private Date dueDate;

	public Meat(float price, boolean available, String type, Date dueDate) {
		super(price, available);
		this.type = type;
		this.dueDate = dueDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
}
