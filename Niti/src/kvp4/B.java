package kvp4;

public class B extends Thread{
	
	public B(String s) {
		super(s);
	}
	
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(getName());
		}
		System.out.println("Kraj izvrsavanja niti B");
	}
}
