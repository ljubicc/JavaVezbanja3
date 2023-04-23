package vozilo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PutnickoVozilo pv;
		TeretnoVozilo tv;
		
		System.out.println("Unesite nosivost mosta:");
		double nosivost = sc.nextDouble();
		
		System.out.println("Unesite vrstu vozila(P ili T):");
		char oznaka = sc.next().charAt(0);
		
		switch(oznaka) {
		case 'P': case 'p':
			System.out.println("Unesite broj putnika i prosecnu tezinu istih i specificnu tezinu vozila:");
			int brojPutnika = sc.nextInt();
			double prosTez = sc.nextDouble();
			double specTez = sc.nextDouble();
			pv = new PutnickoVozilo(specTez, prosTez, brojPutnika);
			if(nosivost < pv.ukupnaTezina()) {
				System.out.println("Ne mozete preci, prekomerna tezina.");
			}
			else {
				System.out.println("Mozete preci most.");
			}
			break;
		case 'T': case 't':
			System.out.println("Unesite tezinu vozila i tezinu tereta:");
			double tezVozila = sc.nextDouble();
			double teret = sc.nextDouble();
			tv = new TeretnoVozilo(tezVozila, teret);
			if(nosivost < tv.ukupnaTezina()) {
				System.out.println("Ne mozete preci, prekomerna tezina.");
			}
			else {
				System.out.println("Mozete preci most.");
			}
			break;
			default:
				System.out.println("Morate uneti P ili T za vrstu vozila!");
			
		}
		
		sc.close();
		

	}

}
