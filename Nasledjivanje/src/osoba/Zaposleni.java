package osoba;

public class Zaposleni extends Osoba{
	
	int brojRadneKnjizice;
	double prosecnaZarada;
	
	public int getBrojRadneKnjizice() {
		return brojRadneKnjizice;
	}
	public void setBrojRadneKnjizice(int brojRadneKnjizice) {
		this.brojRadneKnjizice = brojRadneKnjizice;
	}
	public double getProsecnaZarada() {
		return prosecnaZarada;
	}
	public void setProsecnaZarada(double prosecnaZarada) {
		if(prosecnaZarada > 0.0) {
			this.prosecnaZarada = prosecnaZarada;
		}else
			System.out.println("Greska: prosecna zarada mora biti veca od 0");
	}
	
}
