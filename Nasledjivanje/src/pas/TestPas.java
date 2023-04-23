package pas;

public class TestPas {

	public static void main(String[] args) {
		
		Pas p = new Pas();
		
		//PsiKojiJodluju pkj = new PsiKojiJodluju();
		
		//PsiKojiLaju pkl = new PsiKojiLaju();
		
		LhasaApso la = new LhasaApso();
		
		ZlatniRetriver zr = new ZlatniRetriver();
		
		Basenji b = new Basenji();
		
		System.out.println("Pas: ");		
		p.dahci();
		System.out.println();
		
		System.out.println("Psi koji laju:");
		la.dahci();
		la.laj();
		la.cuvaj();
		zr.dahci();
		zr.laj();
		zr.aportiraj();
		System.out.println();
		
		System.out.println("Psi koji jodluju:");
		b.dahci();
		b.jodluj();
		b.goni();
		
		
		
		
		
		

	}

}
