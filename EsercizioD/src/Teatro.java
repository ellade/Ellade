
public class Teatro {
	protected String spettacolo;
	protected int postiPlatea;
	protected int postiGalleria;
	
	public Teatro(String spettacolo,int postiPlatea,int postiGalleria){
		this.spettacolo=spettacolo;
		this.postiPlatea=postiPlatea;
		this.postiGalleria=postiGalleria;
	}
	public void assegnaPostiPlatea(int assegnati){
		postiPlatea-=assegnati;
	}
	public void assegnaPostiGalleria(int assegnati){
		postiGalleria-=assegnati;
	}
}
