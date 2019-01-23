package model;

public class Autore {


	private int autoreId;

    private String nome;

    private String cognome;

    public Autore(int autoreId, String nome, String cognome) {
    	this.setAutoreId(autoreId);
    	this.setNome(nome);
    	this.setCognome(cognome);
    }
    
	public int getAutoreId() {
		return autoreId;
	}

	public void setAutoreId(int autoreId) {
		this.autoreId = autoreId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
}
