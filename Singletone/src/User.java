
public class User extends Thread {
	private int index;

	public User(int i) {
		index = i;
	}

	public void run() {
		// ����������
		while (true) {
			Printer printer = Printer.getInstance();
			printer.print("hello" + index);
			try {
				this.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
