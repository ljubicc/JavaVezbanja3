package kvp4;

public class A extends Thread{
	
	public A(String s) {
		super(s);
	}
	
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(getName());		
		}
		System.out.println("Kraj izvrsavanja niti A");
	}
	
	
}
