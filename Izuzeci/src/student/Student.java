package student;

public class Student {
	
	String ime;
	String prezime;
	String adresa;
	int brojIndexa;
	
	public Student(String ime, String prezime, String adresa, int brojIndexa) throws Izuzetak {
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		if(brojIndexa > 0 && brojIndexa < 100)
			this.brojIndexa = brojIndexa;
		else
			throw new Izuzetak(brojIndexa);
	}
	
	public void ispisi() {
		System.out.println(ime + "\t" + prezime + "\t" + adresa + "\t" + brojIndexa);
	}
	
}
