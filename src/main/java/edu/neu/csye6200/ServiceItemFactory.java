package edu.neu.csye6200;

public class ServiceItemFactory extends AbstractFactory{
	
	ServiceItem service = new ServiceItem(56, "Scanner", 55);
	@Override
	public Item getObject() {
		
		return service;
		
	}

}
