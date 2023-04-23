package kvp2;

public class Main {

	public static void main(String[] args) {
		
		A a = new A();
		
		Thread t1 = new Thread(a, "Nit 1");
		Thread t2 = new Thread(a, "Nit 2");
		Thread t3 = new Thread(a, "Nit 3");
		
		t3.setPriority(8);
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
