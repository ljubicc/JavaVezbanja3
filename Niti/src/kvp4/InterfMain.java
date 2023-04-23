package kvp4;

public class InterfMain {

	public static void main(String[] args) {
		
		InterfA  a1 = new InterfA("klasa 1");
		InterfA a2 = new InterfA("klasa 2");
		
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a2);
		
		t1.setPriority(2);
		t2.setPriority(8);
		
		t1.start();
		t2.start();

	}

}
