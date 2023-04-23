package kvp1;

public class Main {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		
		System.out.println("Glavna nit, preko objekta: " + t);
		
		System.out.println("Ime glavne niti: " + Thread.currentThread());
		
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(Thread.currentThread().getPriority());
		
		
		

	}

}
