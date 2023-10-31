package edu.neu.csye6200;

public class FoodItemFactory extends AbstractFactory{

	@Override
	public Item getObject() {
		
		return new FoodItem(3, "Butter", 2);
	}

}
