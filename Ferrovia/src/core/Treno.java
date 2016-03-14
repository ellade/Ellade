package core;

public class Treno extends Thread{
	private int codice;
	private int  capacitaMax;
	private int capacitaMin;
	private int dir;
	private int numPasseggeri;
	private Stazione stazione;
	private String nome;
	private boolean arrivato;
	
	public Treno(Stazione s,String nome, int capacitaMax,int capacitaMin, int codice){
	super(nome);
	this.capacitaMax=capacitaMax;
	this.capacitaMin=capacitaMin;
	numPasseggeri=0;
	this.stazione=s;
	this.codice=codice;
	dir=-1;
	arrivato=false;

}
	public void logln(String msg)
	{
		synchronized (System.out)
		{
			System.out.println(getName()+": "+msg);
		}
		
	}
	public int getCapacitaMin(){ return capacitaMin;};
	public int getCapacitaMax(){ return capacitaMax;};
	
	public void setnumPasseggeri(){ this.numPasseggeri++;};
	public void setnumPasseggeriScendi(){this.numPasseggeri=0;};
	public int getnumPasseggero(){ return numPasseggeri;};
	
	public void run()
	{
		try {
			stazione.entra(this);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//tempo prima di uscire: discesa e salita passeggeri
		
		try {
			stazione.esce(this);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
