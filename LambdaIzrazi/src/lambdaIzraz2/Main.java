package lambdaIzraz2;

public class Main {

	public static void main(String[] args) {

		ProveraDeljivosti pd = (n, d) -> (n % d) == 0;

		if (pd.test(9, 2))
			System.out.println("Broj 10 deljiv je brojem 2.");
		else
			System.out.println("Broj 9 nije deljiv brojem 2.");
	}

}
