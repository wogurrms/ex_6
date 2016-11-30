package Client;

import Res.Directory;
import Res.File;
import Res.Item;

public class Client {
	public static void main(String args[]){
		Item dir1 = new Directory("dir1");
		Item dir2 = new Directory("dir2");
		Item dir3 = new Directory("dir3");
		
		Item file1 = new File("file1",10);
		Item file2 = new File("file2",20);
		Item file3 = new File("file3",30);
		Item file4 = new File("file4",40);
		Item file5 = new File("file5",50);
		
		dir1.addItem(file1);
		dir1.addItem(dir2);

		dir2.addItem(file2);
		dir2.addItem(file3);
		dir2.addItem(dir3);
		
		dir3.addItem(file4);
		dir3.addItem(file5);
		
		System.out.println("dir1 size : "+dir1.getSize());
		System.out.println("dir2 size : "+dir2.getSize());
		System.out.println("dir3 size : "+dir3.getSize());
	}
}
