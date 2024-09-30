package snacks;

public class Main {
	public static void main(String [] args) {
		Studente studente1 = new Studente("Truce", "Baldanzi", 22);
		Conto conto1 = new Conto(0,0);
		System.out.println(studente1.presentati());
		
		conto1.doDeposito(1000);
		conto1.saldoConto();
		conto1.doPrelievo(500);
		conto1.saldoConto();
	}
}
