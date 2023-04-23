package kvp5;

public class A extends Thread{
	
	public void run() {
		int i = 1;
		while(i <= 5) {
			System.out.println("i: " + i);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			i++;
		}
	}
}
