package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

import edu.neu.csye6200.FileUtil.Criteria;

public class Store extends AbstractStore{
	
	List<Item> list;
	
	public Store() {
		super();
		this.list = new ArrayList<>();
		
	}

	@Override
	public void addObject() {
		
		FileUtil fl = new FileUtil();
		//Adding foodList Object
		List<Item> foodList  = fl.readfile("FoodItem.csv", Criteria.FoodItem);
		//Adding Electronic Object
		List<Item> electronicList  = fl.readfile("ElectronicItem.csv", Criteria.ElectronicItem);
		//Adding Serice Object
		List<Item> serviceList  = fl.readfile("ServiceItem.csv", Criteria.ServiceItem);
		
		this.list.addAll(foodList);
		this.list.addAll(electronicList);
		this.list.addAll(serviceList);
		for(Item a:this.list) {
			System.out.println(a.toString());
		}
	}

	@Override
	public void sortObject() {
		
		//sort by ID
		System.out.println();
		list.sort((o1,o2) -> ((Integer)o1.id).compareTo((Integer)o2.id));
		System.out.println();
		System.out.println("Sort by ID");
		for(Item a:this.list) {
			System.out.println(a.toString());
		}
		//sort by name
		list.sort((o1,o2) -> (o1.name).compareTo(o2.name));
		System.out.println();
		System.out.println("Sort by Name");
		for(Item a:this.list) {
			System.out.println(a.toString());
		}
		//sort by price
		list.sort((o1,o2) -> ((Double)o1.price).compareTo((Double)o2.price));
		System.out.println();
		System.out.println("Sort by Price");
		for(Item a:this.list) {
			System.out.println(a.toString());
		}
	}
	
	
	public static void demo() {
		
		//Adding all three classes object from csv
		Store s = new Store();
		s.addObject();
		s.sortObject();
		
		//
		System.out.println();
		System.out.println("Demonstrating factory Method Pattern !!!");
		
		AbstractFactory factory = new FoodItemFactory();
		Item item = factory.getObject();
		System.out.println(item.toString());
		System.out.println();
		System.out.println();
		
		System.out.println("Demonstration of late Singleton ");
		AbstractFactory factory1 = new ElectronicItemFactory();
		Item item1 = factory1.getObject();
		System.out.println(item1.toString());
		
		System.out.println();
		System.out.println();
		System.out.println("Demonstration of early Singleton ");
		AbstractFactory factory2 = new ServiceItemFactory();
		Item item2 = factory2.getObject();
		System.out.println(item2.toString());
		
		
	}

}
