package kvp6;

public class A implements Runnable {

	String ime;
	Thread t;

	A(String name) {
		ime = name;
		t = new Thread(this, ime);
		t.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(ime + " = " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
