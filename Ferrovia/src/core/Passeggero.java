package core;

public class Passeggero extends Thread {
	private Treno treno;
	private  String nome;
	private Stazione stazione;
	
	public Passeggero(String nome,Stazione s)
	{
		super(nome);
		this.treno=null;
		this.stazione=s;
		
		
	}
	public void logln(String msg)
	{
		synchronized (System.out)
		{
			System.out.println(getName()+": "+msg);
		}
	}
	public Treno getTreno()
	{
		return this.treno;
	}
	public void setTreno(Treno t)
	{
		this.treno=t;
	}
public void run()
{
	try {
		stazione.sale(this);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	try {
		sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
	
	try {
		stazione.scende(this);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
