package student;

import java.io.*;

public class TestIzuzetak {

	public static void main(String[] args) throws Exception {

		String ime;
		String prezime;
		String adresa;
		int indeks;

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite broj studenata: ");
		int brojS = Integer.parseInt(input.readLine());

		Student[] nizStudenata = new Student[brojS];

		try {
			for (int i = 0; i < nizStudenata.length; i++) {
				System.out.println("Unesite ime " + (i + 1) + ". studenta:");
				ime = input.readLine();
				System.out.println("Unesite prezime " + (i + 1) + ". studenta:");
				prezime = input.readLine();
				System.out.println("Unesite adresu " + (i + 1) + ". studenta:");
				adresa = input.readLine();
				System.out.println("Unesite broj indeksa " + (i + 1) + ". studenta:");
				indeks = Integer.parseInt(input.readLine());

				nizStudenata[i] = new Student(ime, prezime, adresa, indeks);
			}
			System.out.println("Ime\tPrezime\tAdresa\tBroj indeksa");
			for (int i = 0; i < nizStudenata.length; i++) {
				nizStudenata[i].ispisi();
			}

		} catch (Izuzetak e) {
			System.out.println(e.getMessage());
			System.out.println("Indeks studenta za koji se desio izuzetak je: " + e.getIndexsStudenta());
		}

	}

}
