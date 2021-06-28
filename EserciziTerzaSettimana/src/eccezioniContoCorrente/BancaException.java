package eccezioniContoCorrente;

public class BancaException extends Exception{
	
	public BancaException(String message) {
		super(message);
	}
	
	public String toString() {
		return getMessage();
	}
	
}
