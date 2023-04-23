package uredjaj;

public class TestUredjaj {

	public static void main(String[] args) {
		
		Uredjaj u = new Uredjaj("Samsung", false);
		
		MasinaZaVes k = new MasinaZaVes("Gorenje", false, 30, 2);
		
		u.iskljuci();
		System.out.println("Podaci o uredjaju:");
		u.ispisi();
		
		
		k.ukljuci();
		k.promeniProgramNavise();
		
		System.out.println("Podaci o masini za ves:");
		k.ispisi();
				

	}

}
