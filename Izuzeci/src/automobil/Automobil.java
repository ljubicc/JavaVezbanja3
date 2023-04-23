package automobil;

import java.io.*;

public class Automobil {

	String naziv;
	String proizvodjac;
	int godiste;
	double potrosnja;

	public void unetiNazivAutomobila() throws IOException {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite naziv automobila: ");
		naziv = ulaz.readLine();
	}

	public void unetiProizvodjacaAutomobila() throws IOException {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite proizvodjaca automobila: ");
		proizvodjac = ulaz.readLine();
	}

	public void unetiGodisteAutomobila() {

		try {

			BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Unesite godiste automobila: ");
			godiste = Integer.parseInt(ulaz.readLine());

		} catch (Exception e) {
			System.out.println("Niste dobro uneli broj");
			unetiGodisteAutomobila();
		}
	}

	public void unetiPotrosnjuAutomobila() {
		while (true) {
			try {
				BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Unesite potrosnju automobila na 100 km: ");
				potrosnja = Double.parseDouble(ulaz.readLine());
				break;
			} catch (Exception e) {
				System.out.println("Niste ispravno uneli potrosnju automobila.");
			}
		}
	}

	public String toString() {
		return "Naziv: " + naziv + "\nProizvodjac: " + proizvodjac + "\nGodiste: " + godiste + "\nPotrosnja: "
				+ potrosnja;

	}
}
