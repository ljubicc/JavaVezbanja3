package lambdaIzraz3;

public class Main {

	public static void main(String[] args) {

		OkreniString os = (str) -> {

			String rezultat = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				rezultat += str.charAt(i);
			}
			return rezultat;
		};

		System.out.println("12345 " + os.okreniString("12345"));
		System.out.println("Java obrnuto: " + os.okreniString("Java"));

	}

}
