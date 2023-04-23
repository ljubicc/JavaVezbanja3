package enum4;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Boja - redni broj:");
		for(Boja boja : Boja.values()) {
			System.out.println(boja + " " + boja.ordinal());
		}

		Boja b1, b2;
		b1 = Boja.Crvena;
		b2 = Boja.Crvena;
		
		
		if(b1.compareTo(b2) < 0)
			System.out.println(b1 + " dolazi pre " + b2);
		if(b1.compareTo(b2) > 0)
			System.out.println(b1 + " dolazi posle " + b2);;
			
			
		if(b1.equals(b2))
			System.out.println("Imaju iste vrednosti " + b1 + " = "+ b2);
		
		
		
	}

}
