
public class Client {
	public static void main(String args[]){
		User[] users = new User[5];
		for(int i=0;i<5;i++){
			users[i] = new User(i);
			users[i].start();
		}
	}
}
