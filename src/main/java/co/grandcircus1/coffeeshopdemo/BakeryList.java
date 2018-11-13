package co.grandcircus1.coffeeshopdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BakeryList {
	private List<BakeryItem> list = new ArrayList<>();
	
	public BakeryList() {
		list.add(new BakeryItem("Mango Lassi", "Fruit and fresh cream drink", 3.99));
		list.add(new BakeryItem("Paratha Paneer wrap", "Bread with veggie and cheese", 4.99));
		list.add(new BakeryItem("Fruit cake", "Tootie Fruitee", 1.99));
		list.add(new BakeryItem("Apple turnover", "Pastry", 0.99));
		list.add(new BakeryItem("Chai", "Milk Tea", 2.99));
		
	}
	
	public List<BakeryItem>getList(){
		return list;
	}
	

}
