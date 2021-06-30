package esercizioApacheLibraries;

public class Presenza {
	private String nome;
	private int giorniPresenza;

	public Presenza(String nome, int giorniPresenza) {
		this.nome = nome;
		this.giorniPresenza = giorniPresenza;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getGiorniPresenza() {
		return giorniPresenza;
	}

	public void setGiorniPresenza(int giorniPresenza) {
		this.giorniPresenza = giorniPresenza;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", giorniPresenza=" + giorniPresenza + "]";
	}

	
}
