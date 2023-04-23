package vozilo;

public class TeretnoVozilo extends Vozilo{
	
	private double teret;

	public TeretnoVozilo(double sopTez, double teret) {
		super(sopTez);
		this.teret = teret;
	}
	
	
	public double ukupnaTezina() {
		return this.getTezina() + this.teret;
	}
	
	public char vrstaVozila() {
		return 'T';
	}
	
	@Override
	public String opis() {
		return super.opis() + " ukupna tezina: " + ukupnaTezina();
	}
}

