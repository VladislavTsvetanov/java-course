package task4;

import java.util.ArrayList;
import java.util.List;

import task3.Stock;

public class Shop {
	
	private String name;
	
	private String address;
	
	private List<Stock> stocks = new ArrayList<>();

	public Shop(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void addStock(Stock stock) {
		stocks.add(stock);
	}
	
	public void impoverishStock(Stock stock) {
		stock.setAvailable(false);
	}
	
}
