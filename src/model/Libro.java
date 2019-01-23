package model;

public class Libro {

	private String titolo;
	private String descrizione;
	private int libroId;
	private int autoreId;
	
	
	public Libro(String titolo, String descrizione) {
		this.setTitolo(titolo);
		this.setDescrizione(descrizione);
	}

	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getLibroId() {
		return libroId;
	}
	
	public void setLibroId(int libroId) {
		this.libroId = libroId;
	}
	
	public int getAutoreId() {
		return autoreId;
	}
	
	public void setAutoreId(int autoreId) {
		this.autoreId = autoreId;
	}
}