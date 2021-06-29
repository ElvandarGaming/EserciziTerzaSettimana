package collectionsDuranteTeoria;

public class Persona {
	private String nome;
	private String cognome;
	private String codiceFiscale;

	public Persona(String nome, String cognome, String codiceFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("ho chiamato equals");
		if (o != null && o.getClass() != Persona.class) {
			return false;
		}
		Persona other = (Persona) o;
		return (codiceFiscale.equals(other.codiceFiscale) && nome.equals(other.nome) && cognome.equals(other.cognome));
		/*
		 * if (codiceFiscale.equals(other.codiceFiscale)) { return true; } return false;
		 */

	}

	@Override
	public int hashCode() {
		System.out.println("ho chiamato hashCode");
		return codiceFiscale.hashCode();
	}

	@Override
	public String toString() {
		return nome + " " + cognome;
	}
}
