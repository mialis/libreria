package model;

public class Autore {

	private int id;

    private String nome;

    private String cognome;

    public Autore(String nome, String cognome) {
    	this.setNome(nome);
    	this.setCognome(cognome);
    }
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
