package core;

public class Stazione implements Station 
{
	private boolean disponibilita;
	private String nomeStazione;
	
	
	public Stazione(String nomeStazione)
	{
		this.nomeStazione=nomeStazione;
		
		disponibilita=true;
		
	}
	
	public  synchronized  void entra(Treno t) throws InterruptedException
	{
		t.logln("Sono il treno: "+t.getName()+ " che vuole entrare in stazione ");
		while(!disponibilita) //condizioni per cui il treno non può  entrare
		{
			t.logln("Sono il treno "+ t.getName()+" che non posso entrare");	
		wait();
		
	
		}
		t.logln("Sono entrato sul binario");
		disponibilita=false;
		
		while(t.getnumPasseggero()!=0)
		{
			t.logln("aspetto finchè non scarico i personaggi");
			wait();
			t.logln("sono stato notificato");
		}
		
		while(t.getCapacitaMax()>t.getnumPasseggero())
		{
			wait();
		}
	
		t.setnumPasseggeri();
	}
	
	public  synchronized  void esce(Treno t) throws InterruptedException
	{
		t.logln("Sono il treno: "+t.getName()+ " che vuole uscire dalla stazione ");
		
		while(t.getCapacitaMin()>t.getnumPasseggero())
		{
			t.logln("Sono il treno "+ t.getName()+" che non posso uscire");
			wait();
			
			
		}
		t.logln("Sono il treno: "+t.getName()+" che sta uscendo dalla stazione");
		disponibilita=true;
		notifyAll(); 
	}
/*
	@Override
	public synchronized void sale(Passeggero p) throws InterruptedException{
		p.logln("Sono il passeggero " + p.getName()+" che vuole salire sul treno");
		while(p.getTreno().getCapacitaMax()>=p.getTreno().getnumPasseggero())
		{
			wait();
		}
		p.logln("Sono il passeggero: "+p.getName()+" che sta salendo sul treno");
		p.getTreno().setnumPasseggeri();
	}
*/
	@Override
	public synchronized void scende(Passeggero p) throws InterruptedException{
		p.logln("Sono il passeggero " + p.getName()+" che vuole scendere dal treno");
		p.getTreno().setnumPasseggeriScendi();
		
	}
	public static void main(String aegs[])
	{
		
		int capacitaMin=1;
		int capacitaMax=3;
		Stazione s1 =new Stazione("A");
		Stazione s2=new Stazione("B");
	
	
		for(int i=0;i<5;++i){
		new Treno(s1,"T"+i,10,2,45+i).start();
		}
		for(int i=5;i<10;++i){
			new Treno(s2,"T"+i,10,2,100+i).start();
			}
		
		for(int j=0;j<50;++j)
			new Passeggero("P"+j,s1).start();
		for(int j=50;j<100;++j)
			new Passeggero("P"+j,s2).start();
		
	}

	@Override
	public void sale(Passeggero p) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}
	

}
