package student;

public class Izuzetak extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int indexStudenta;
	
	public Izuzetak() {
		indexStudenta = -1;
	}
	
	public Izuzetak(int indexsStudenta) {
		super("Desio se izuzetak.");
		this.indexStudenta = indexsStudenta;
	}
	
	public int getIndexsStudenta() {
		return indexStudenta;
	}
}
