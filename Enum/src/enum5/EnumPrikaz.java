package enum5;

public class EnumPrikaz {
	
	static void odgovori(Odgovori odg) {
		
		switch(odg) {
		case NE:
			System.out.println("Ne");
			break;
		case DA:
			System.out.println("Da");
			break;
		case MOZDA:
			System.out.println("Mozda");
			break;
		case KASNIJE:
			System.out.println("Kasnije");
			break;
		case USKORO:
			System.out.println("Uskoro");
			break;
		case NIKAD:
			System.out.println("Nikad");
			break;
		}
	}
}
