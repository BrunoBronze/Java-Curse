package Util;

public class Quartos {

	private int quarto;
	private String locador;
	private String email;
	private Boolean situacao;

	public Quartos(int quarto, String locador, String email, Boolean situacao) {

		this.quarto = quarto;
		this.locador = locador;
		this.email = email;
		this.situacao = situacao;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

	public String getLocador() {
		return locador;
	}

	public void setLocador(String locador) {
		this.locador = locador;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getSituacao() {
		return situacao;
	}

	public void setSituacao(Boolean situacao) {
		this.situacao = situacao;
	}

	public String toString() {
		return quarto + ": " + locador + "," + email + "\n";
	}

}
