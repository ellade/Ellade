#prova di cambiamento e import
public class Esonero2a {
	public static void main(String[] args){
		SalaCinema s1=new SalaCinema("Van Helsing",15);
		s1.vendiBiglietti(5);
		System.out.println("Posti disponibili:"+s1.getPosti());
		System.out.println();
		SalaCinemaP s2=new SalaCinemaP("Scooby Doo 2:mostri scatenati",18);
		s2.stampaSituazione();
		s2.vendiBiglietti(24);
		System.out.println("Posti disponibili:"+s2.getPosti());
		s2.calcolaFile();
		s2.stampaSituazione();
	}
}
