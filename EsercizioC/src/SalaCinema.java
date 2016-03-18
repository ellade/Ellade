
public class SalaCinema {
	public static int DEFAULT_MAXFILA=21;
	protected String film;
	protected int postiOcc;
	protected int n_file;
	protected int maxFila;
	
	public SalaCinema(String film,int n_file){
		this.film=film;
		this.n_file=n_file;
		postiOcc=0;
		maxFila=DEFAULT_MAXFILA;
	}
	public int getPosti(){
		return n_file*maxFila-postiOcc;
	}
	public void vendiBiglietti(int occupati){
		postiOcc+=occupati;
	}
}
