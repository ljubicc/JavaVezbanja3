package kvp4;

public class InterfA implements Runnable{
	
	String ime;
	public InterfA(String ime) {
		this.ime = ime;
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(ime);
		}
	}
}
