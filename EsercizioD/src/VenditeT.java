
public class VenditeT extends Teatro {
	public VenditeT(String spettacolo,int postiPlatea,int postiGalleria){
		super(spettacolo,postiPlatea,postiGalleria);
	}
	public void vendiBiglietti(int x,boolean y){
		if(y==true)
			assegnaPostiGalleria(x);
		else
			assegnaPostiPlatea(x);
	}
	public int riepilogo(boolean y){
		if(y==true)
			return postiGalleria;
		else
			return postiPlatea;
	}
}
