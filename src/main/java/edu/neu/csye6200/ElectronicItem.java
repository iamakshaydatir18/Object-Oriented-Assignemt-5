package edu.neu.csye6200;

public class ElectronicItem extends Item {

	
	public ElectronicItem(int id,String name,double price) {
		super(id,name,price);
		
	}

	@Override
	public String toString() {
		return "ElectronicItem [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	

	

}
