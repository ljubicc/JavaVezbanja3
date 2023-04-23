package al2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ALBrojevi {
	
	Scanner scanner = new Scanner(System.in);
	
	List<Integer> brojevi = new ArrayList<Integer>();
	
	void unosBrojeva() {
		System.out.println("Za prekid unosenja unesite -1: ");
		while(true) {
			System.out.println("Broj: ");
			int num = scanner.nextInt();
			if(num == -1)
				return;
			// smestanje ucitanih vrednisti sa konzole u kolekciju
			this.brojevi.add(num);
		}
	}
	
	void ispisBrojeva() {
		System.out.print(this.brojevi + " ");
	}
	
	
}
