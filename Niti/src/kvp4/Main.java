package kvp4;

public class Main {

	public static void main(String[] args) {
		
		A a = new A("Nit A");
		B b = new B("Nit B");
		C c = new C("Nit C");
		
		b.setPriority(Thread.MAX_PRIORITY);
		
		a.start();
		b.start();
		c.start();

	}

}

