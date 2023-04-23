package kvp4;

public class KlasaMain {

	public static void main(String[] args) {
		
		KlasaA prva = new KlasaA("Prva Klasa");
		KlasaA druga = new KlasaA("Druga Klasa");
		
		prva.setPriority(2);;
		druga.setPriority(8);
		
		prva.start();
		druga.start();

	}

}
