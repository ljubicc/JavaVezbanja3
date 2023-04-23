package uredjaj;

public class Uredjaj {
	
	String marka;
	boolean ukljucen;
	
	public Uredjaj(String m, boolean u) {
		if(m != null) {
			this.marka = m;
			this.ukljucen = u;
		}else
			System.out.println("Greska: marka ne sme biti null");
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		if(marka != null)
		   this.marka = marka;
		else
			System.out.println("Greska: marka ne sme biti null");
	}
	public void ukljuci() {
		ukljucen = true;
	}
	public void iskljuci() {
		ukljucen = false;
	}
	public void ispisi() {
		System.out.println("Marka: " + marka);
		if(ukljucen) {
			System.out.println("Uredjaj je ukljucen.");
		}
		else {
			System.out.println("Uredjaj je iskljucen.");
		}
	}
}
