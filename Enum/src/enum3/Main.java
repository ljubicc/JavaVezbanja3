package enum3;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Udeo zelene boje: " + Boja.Zelena.getUdeo());
		System.out.println("Sve boje:");
		for(Boja boja : Boja.values()) {
			System.out.println(boja + " udeo: " + boja.getUdeo());
		}

	}

}
