package Res;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Item {
	private List<Item> items = new ArrayList<Item>();
	
	public Directory(String name){
		super(name);
	}
	@Override
	public void addItem(Item item){
		items.add(item);
	}
	
	@Override
	public int getSize() {
		int totalSz = 0;
		for(Item item : items){
			totalSz += item.getSize();
		}
		return totalSz;
	}

}
