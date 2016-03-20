package core;

public interface Station {
	//interfaccia: raccoglie tutti i metodi da implementare nella synchronize
	 void entra(Treno t) throws InterruptedException;
	
	 void esce(Treno t) throws InterruptedException;
	
	 void sale(Passeggero p) throws InterruptedException;
	
	 void scende(Passeggero p) throws InterruptedException;
	

}
