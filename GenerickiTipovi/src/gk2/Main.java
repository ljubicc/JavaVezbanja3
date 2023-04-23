package gk2;

public class Main {

	public static void main(String[] args) {

		A<Integer, String> objekat1 = new A<Integer, String>(100, "Java");
		objekat1.prikaziTip();

		int intVrednost = objekat1.getObj1();
		System.out.println("Vrednost: " + intVrednost);
		String strVrednost = objekat1.getObj2();
		System.out.println("Vrednost: " + strVrednost);

		A<String, Double> objekat2 = new A<String, Double>("tekst123", 123.45);
		objekat2.prikaziTip();

		String s2 = objekat2.getObj1();
		System.out.println("Vrednost: " + s2);

		double d2 = objekat2.getObj2();
		System.out.println("Vrednost: " + d2);

		A<Boolean, Integer> objekat3 = new A<Boolean, Integer>(true, 101);
		objekat3.prikaziTip();

		boolean b3 = objekat3.getObj1();
		System.out.println("Vrednost: " + b3);

		int i3 = objekat3.getObj2();
		System.out.println("Vrednost: " + i3);
	}

}
