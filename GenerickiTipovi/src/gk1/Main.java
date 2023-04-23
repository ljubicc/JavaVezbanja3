package gk1;

public class Main {

	public static void main(String[] args) {
		// Pravi objekat A za tip Integer
		A<Integer> intObjekat = new A<Integer>(100);

		intObjekat.prikaziTip();
		int vrednostObjekta = intObjekat.getOb();
		System.out.println("Vrednost: " + vrednostObjekta);

		// Pravi objekat A za tip String
		A<String> stringObjekat = new A<String>("tekst");
		stringObjekat.prikaziTip();

		String str = stringObjekat.getOb();
		System.out.println("Vrdnost: " + str);

	}

} // Zakljucak: T je zamena za stvarni tip koji ce biti zadat u trenutku
// kreiranja objekta klase A.
