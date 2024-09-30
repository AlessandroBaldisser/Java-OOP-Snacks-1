package snacks;

public class Studente {
	private String nome;
	private String cognome;
	private int eta;
	
	Studente(String nome, String cognome, int eta){
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	// GETTERS
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public int getEta() {
		return eta;
	}
	
	
	public String presentati() {
		String presentazione = String.format("Ciao mi chiamo %s %s e ho %d anni", nome, cognome, eta);
		return presentazione;
	}

	
	// SETTERS
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void SetCognome(String cognome) {
		this.cognome = cognome;
	}
	public void setEta(int eta) {
		if (eta > 0) {
			this.eta = eta;
		}
	}
	

}
