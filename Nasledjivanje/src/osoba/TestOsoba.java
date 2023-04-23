package osoba;

public class TestOsoba {

	public static void main(String[] args) {
		
		Osoba os = new Osoba();
		
		os.setIme("Laza");
		os.setPrezime("Lazic");
		os.setMaticniBroj("1110977105617");
		
		System.out.println("Podaci o osobi:");
		System.out.println("Ime osobe: " + os.getIme());
		System.out.println("Prezime osobe: " + os.getPrezime());
		System.out.println("Maticni broj osobe: " + os.getMaticniBroj());
		
		System.out.println();
		Zaposleni z = new Zaposleni();
		
		z.setIme("Mika");
		z.setPrezime("Mikic");
		z.setMaticniBroj("1010988725376");
		z.setProsecnaZarada(18000);
				
		System.out.println("Podaci o zaposlenom:");
		System.out.println("Ime zaposlenog: " + z.getIme());
		System.out.println("Prezime zaposlenog: " + z.getPrezime());
		System.out.println("Maticni broj zaposenog: " + z.getMaticniBroj());
		System.out.println("Prosecna zarada zaposelnog: " + z.getProsecnaZarada());
	}

}
