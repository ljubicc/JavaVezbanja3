package uredjaj;

public class MasinaZaVes extends Uredjaj{
	
	int program = 1;
	int temperatura;

	public MasinaZaVes(String marka, boolean ukljucen, int temp, int prog) {
		super(marka, ukljucen);
		if(prog >= 1 && prog <= 5) {
		    this.program = prog;
		}
		else {
			System.out.println("Greska: program mora biti izmedju 1 i 5");
		}
		if(temp >= 0) {
		    this.temperatura = temp;
		}
		else
			System.out.println("Grska: temperatura mora biti veca od 0");

	}
	public void promeniProgramNavise() {
		if(program < 5)
			program ++;
		else
			program = 1;
	}
	public void promeniProgramNanize() {
		if(program > 1) {
			program --;
		}
		else
			program = 5;
	}
	@Override
	public void ispisi() {
		super.ispisi();
		System.out.println("Trenutni program: " + program + "\nPodesena temperatura: " + temperatura);
	}
	
}
