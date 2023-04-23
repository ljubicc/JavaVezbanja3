package osoba;

public class Osoba {
	
	String ime = "N";
	String prezime = "N";
	String maticniBroj;
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		if(ime.isBlank() || ime.isEmpty()) {
			System.out.println("Greska: ime ne sme biti null");			
		} else {
			this.ime = ime;
		}
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		if(prezime.isBlank() || prezime.isEmpty()) {
			System.out.println("Greska: prezime ne sme biti null");			
		} else {
			this.prezime = prezime;
		}
	}
	public String getMaticniBroj() {
		return maticniBroj;
	}
	public void setMaticniBroj(String maticniBroj) {
		if(maticniBroj.isBlank() || maticniBroj.isEmpty()) {
			System.out.println("Greska: maticni broj ne sme biti null");			
		} else {
			this.maticniBroj = maticniBroj;
		}
	}
	
}
