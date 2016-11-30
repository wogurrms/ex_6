package Res;

public class File extends Item {
	private int size = 0;
	
	public File(String name,int size){
		super(name);
		this.size = size;
	}
	@Override
	public void addItem(Item item){
	}
	@Override
	public int getSize() {
		return size;
	}

}
