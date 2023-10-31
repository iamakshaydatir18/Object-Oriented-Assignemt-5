package edu.neu.csye6200;

public class ElectronicItemFactory extends AbstractFactory{

	ElectronicItem item;
	@Override
	public Item getObject() {
		// TODO Auto-generated method stub
		
		if(item == null) {
			
			item = new ElectronicItem(109,"Microwave",20.8);
			
		}
		
		return item;
		
	}
	
	

}
