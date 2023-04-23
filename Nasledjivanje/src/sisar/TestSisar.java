package sisar;

public class TestSisar {
	public static void main(String[] args) {
		
		Sisar s = new Sisar();
		System.out.println(s.uzmiBojuOciju());
		
		Pas p = new Pas();
		p.lajati();
		System.out.println(p.uzmiBojuOciju());
		
		Macka m = new Macka();
		m.mjaukati();
		System.out.println(m.uzmiBojuOciju());
	}
}
