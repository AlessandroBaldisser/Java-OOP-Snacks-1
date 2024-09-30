package snacks;

public class Conto {
	private int numeroConto;
	private int saldo;
	
	Conto(int numeroConto, int saldo){
		this.numeroConto = numeroConto;
		this.saldo = saldo;
	}
	
	// GETTERS
	
	public int getNumeroConto() {
		return numeroConto;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	// SETTERS 
	
	public void setNumeroConto(int numeroConto) {
		this.numeroConto = numeroConto;
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	
	public int doDeposito(int deposito) {
		saldo += deposito;
		return saldo;
	}
	
	public int doPrelievo(int prelievo) {
		saldo -= prelievo;
		return saldo;
	}
	
	
	public void saldoConto() {
		System.out.println(this.saldo);
	}
}

