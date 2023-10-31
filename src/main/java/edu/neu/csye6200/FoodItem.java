package edu.neu.csye6200;

public class FoodItem extends Item{
	

	public FoodItem(int id2, String name2, double price2) {
		super(id2, name2, price2);
		
	}

	@Override
	public String toString() {
		return "FoodItem [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
