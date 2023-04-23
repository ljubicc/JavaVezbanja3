package artikal;

import java.io.*;

public class TestArtikal {

	public static void main(String[] args) throws Exception {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite naziv artikla: ");
		String naziv = input.readLine();
		System.out.println("Unesite proizvodjaca artikla:");
		String proizvodjac = input.readLine();
		System.out.println("Unesite barkod artikla: ");
		String barkod = input.readLine();
		System.out.println("Unesite cenu artikla: ");
		double cena = Double.parseDouble(input.readLine());

		Artikal a = new Artikal();

		try {
			a.setNaziv(naziv);
			a.setProizvodjac(proizvodjac);
			a.setBarkod(barkod);
			a.setCena(cena);

			System.out.println("Uneti podaci o artiklu su: ");
			System.out.println(a.toString());

		} catch (IzuzetakArtikal e) {
			System.out.println("Greska: " + e.getMessage());

		}
	}

}
