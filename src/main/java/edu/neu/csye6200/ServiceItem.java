package edu.neu.csye6200;

public class ServiceItem extends Item{

	public ServiceItem(int id2, String name2, double price2) {
		super(id2, name2, price2);
			}

	
	@Override
	public String toString() {
		return "ServiceItem [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	

}
