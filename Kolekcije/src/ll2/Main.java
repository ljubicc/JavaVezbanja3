package ll2;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		String imena[] = {"Mika", "Zika", "Fica"};
		
		List<String> listaImena = new LinkedList<String>();		
		for(String s : imena)
			listaImena.add(s);
		
		System.out.println("Prva lista: " + listaImena);
		
		String imena1[] = {"Ana", "Lena", "Hana", "Una"};
		List<String> listaImena1 = new LinkedList<String>();
		for(String ime : imena1)
			listaImena1.add(ime);
		
		System.out.println("Druga lista: " + listaImena1);
		
		listaImena.addAll(listaImena1);
		System.out.println("Nova lista: " + listaImena);
		
		listaImena.subList(1, 4).clear();
		System.out.println("Lista nakon brisanja elemenata sa indeksima od 1 - 4 " + listaImena);
	}

}
