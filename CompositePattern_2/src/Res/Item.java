package Res;

public abstract class Item {
	private String name;
	public abstract int getSize();
	public abstract void addItem(Item item);
	public Item(String name) {
		this.name = name;
	}
}
