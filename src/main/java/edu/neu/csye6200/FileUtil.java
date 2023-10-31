package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	
	
	
	enum Criteria {
		FoodItem,
		ElectronicItem,
		ServiceItem }

	public List<Item> readfile(String path, Criteria criteria) {
		
		List<Item> list = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			String line = null;
			
			while((line = br.readLine()) !=null) {
				
				String[] array = line.split(",");
				
			
				int id =Integer.parseInt(array[2]);
				
				String name = array[0];
				double price = Double.parseDouble(array[1]);
				
				
				Item item = null;
				if(criteria == Criteria.FoodItem) {
					item = new FoodItem(id, name, price);
				}else if(criteria == Criteria.ElectronicItem) {
					
					item =new ElectronicItem(id, name, price);
				}else {
					item = new ServiceItem(id, name, price);
				}
				
				list.add(item);

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return list;
	}
	
	public void writeFile(String path,List<Item> list) {
		
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(path));
			
			for(Item a:list) {
				br.write(path.toString());
			}
			
			br.flush();
			
		}catch(Exception e) {
			
		}
	}
	
	
}
