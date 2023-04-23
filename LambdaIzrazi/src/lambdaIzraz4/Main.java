package lambdaIzraz4;

public class Main {

	public static void main(String[] args) {

		NegativanBroj nb = (n) -> (n < 0);

		if (nb.isNegativan(-3))
			System.out.println("Broj -3 je negativan");

	}

}
