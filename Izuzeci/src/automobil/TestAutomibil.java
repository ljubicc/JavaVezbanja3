package automobil;

import java.io.*;

public class TestAutomibil {

	public static void main(String[] args) throws IOException {

		Automobil a = new Automobil();

		a.unetiNazivAutomobila();
		a.unetiProizvodjacaAutomobila();
		a.unetiGodisteAutomobila();
		a.unetiPotrosnjuAutomobila();

		System.out.println("Uneti podaci o automobilu su: ");
		System.out.println(a.toString());

	}

}
