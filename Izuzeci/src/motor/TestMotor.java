package motor;

import java.io.*;

public class TestMotor {

	public static void main(String[] args) throws Exception {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite marku motora: ");
		String marka = input.readLine();
		System.out.println("Unesite kubikazu motora: ");
		double kubikaza = Double.parseDouble(input.readLine());

		Motor m = new Motor();

		try {
			m.setMarka(marka);
			m.setKubikaza(kubikaza);

			System.out.println("Uneti podaci o motoru su: ");
			m.ispisi();
		} catch (IzuzetakMotor e) {
			System.out.println("Greska! " + e.getMessage());
		}
	}

}
