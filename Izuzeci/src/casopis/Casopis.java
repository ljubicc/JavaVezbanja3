package casopis;

public class Casopis {

	String naslov;
	String izdavac;
	int brojCasopisa;
	double cena;

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) throws IzuzetakCasopis {
		if (naslov.isBlank() || naslov.isEmpty())
			throw new IzuzetakCasopis("Naslov casopisa ne sme biti null!");
		this.naslov = naslov;
	}

	public String getIzdavac() {
		return izdavac;
	}

	public void setIzdavac(String izdavac) throws IzuzetakCasopis {
		if (naslov.isBlank() || naslov.isEmpty())
			throw new IzuzetakCasopis("Izdavac casopisa ne sme biti null!");
		this.izdavac = izdavac;
	}

	public int getBrojCasopisa() {
		return brojCasopisa;
	}

	public void setBrojCasopisa(int brojCasopisa) {
		this.brojCasopisa = brojCasopisa;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) throws IzuzetakCasopis {
		if (cena <= 0)
			throw new IzuzetakCasopis("Cena mora biti veca od nule.");
		this.cena = cena;
	}

	public String toString() {
		return "Naslov: " + naslov + "\nIzdavac: " + izdavac + "\nBroj casopisa: " + brojCasopisa + "\nCena: " + cena;

	}

}
