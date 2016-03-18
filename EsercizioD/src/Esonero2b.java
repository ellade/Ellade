
public class Esonero2b {
	public static void main(String[] args){
		Teatro t1=new Teatro("Aggiungi un posto a tavola",50,20);
		System.out.println("Lo spettacolo è "+t1.spettacolo);
		System.out.println("Ci sono "+t1.postiGalleria+" posti in galleria e "+t1.postiPlatea+" in platea\n");
		t1.assegnaPostiPlatea(15);
		t1.assegnaPostiGalleria(5);
		System.out.println("Lo spettacolo è "+t1.spettacolo);
		System.out.println("Ci sono "+t1.postiGalleria+" posti in galleria e "+t1.postiPlatea+" in platea\n");
		VenditeT t2=new VenditeT("Rugantino",40,15);
		t2.vendiBiglietti(15,false);
		System.out.println("Posti dissponibili:"+t2.riepilogo(false));
	}
}
