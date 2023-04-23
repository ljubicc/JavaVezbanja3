package kvp4;

public class KlasaA extends Thread{
	
	public KlasaA(String ime) {
		super(ime);
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName()); 
			
		}
	}
}
