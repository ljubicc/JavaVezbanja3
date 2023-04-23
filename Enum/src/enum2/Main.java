package enum2;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Boje: ");
		Boja[] nizBoja = Boja.values();
		for(Boja bo : nizBoja)
			System.out.println(bo);
		
		System.out.println();
		
		Boja boja = Boja.valueOf("Bela");
		System.out.println(boja);
		
		
	}

}
