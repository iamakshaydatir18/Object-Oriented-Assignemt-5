package edu.neu.csye6200;

public abstract class Item {
	
	int id;
	String name;
	double price;
	
	
	public Item(int id2, String name2, double price2) {
		this.id =id2;
		this.name  = name2;
		this.price = price2;
	}

	public abstract String toString();

}
