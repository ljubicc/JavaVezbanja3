package vozilo;

public class PutnickoVozilo extends Vozilo{
	
	private int brojPutnika;
	private double prosTezina;
	
	public PutnickoVozilo(double specTez, double prosTezina, int brojPutnika) {
		super(specTez);
		this.prosTezina = prosTezina;
		this.brojPutnika = brojPutnika;
	}
	
	public char vrstaVozila() {
		return 'P';
	}
	
	public double ukupnaTezina() {
		return prosTezina * brojPutnika + super.getTezina();
	}
	
	public String opis() {
		return super.opis() + " ukupna tezina " + ukupnaTezina();
	}
}

