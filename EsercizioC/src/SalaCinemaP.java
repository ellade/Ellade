
public class SalaCinemaP extends SalaCinema {
	protected int fileOccupate;
	
	public SalaCinemaP(String film,int n_file){
		super(film,n_file);
	}
	public void calcolaFile(){
		fileOccupate=postiOcc/maxFila;
	}
	public void stampaSituazione(){
		System.out.println("Nella sala viene proiettato "+film);
		System.out.println("Ci sono "+n_file+" file da "+maxFila+" posti");
		if(fileOccupate!=1){
			System.out.println("I posti occupati sono "+postiOcc+", quindi sono esaurite "+fileOccupate+" file\n");
		}
		else{
			System.out.println("I posti occupati sono "+postiOcc+", quindi è esaurita "+fileOccupate+" fila");
		}
	}
}
