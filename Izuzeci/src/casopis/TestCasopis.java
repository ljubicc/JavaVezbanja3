package casopis;

import java.io.*;

public class TestCasopis {

	public static void main(String[] args) throws Exception {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite naslov casopisa: ");
		String naslov = input.readLine();
		System.out.println("Unesite izdavaca casopisa: ");
		String izdavac = input.readLine();
		System.out.println("Unesite broj casopisa: ");
		int brojCasopisa = Integer.parseInt(input.readLine());
		System.out.println("Unesite cenu casopisa: ");
		double cena = Double.parseDouble(input.readLine());

		Casopis c = new Casopis();

		try {
			c.setNaslov(naslov);
			c.setIzdavac(izdavac);
			c.setBrojCasopisa(brojCasopisa);
			c.setCena(cena);

			System.out.println("Uneti podaci o casopisu su: ");
			System.out.println(c.toString());
		} catch (IzuzetakCasopis e) {
			System.out.println("Greska: " + e.getMessage());
		}

	}

}
