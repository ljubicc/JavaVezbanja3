package al4;

import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<Integer> listaBrojeva = new LinkedList<Integer>();

		System.out.println("Ukoliko zelite da prekinete unos otkucajte -1.");

		while (true) {
			System.out.println("Unesite broj:");
			int broj = scanner.nextInt();
			if (broj == -1)
				break;

			listaBrojeva.add(broj);
		}

		for (int i : listaBrojeva)
			System.out.print(i + " ");

		System.out.println();
		Iterator<Integer> iter = listaBrojeva.iterator();

		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}

		scanner.close();

		/*
		 * 
		 * Kreirati program za unos vrednosti sa konzole, smeštanje u kolkeciji
		 * LinkedList ispisavanje smeštenih vrednosti.
		 * 
		 */

	}

}
