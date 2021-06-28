package eccezioni;

public class ContoCorrente {
	double saldo;

	public double ritira(double ammontare) {
		if(saldo>=ammontare) {
		saldo = saldo - ammontare;
		return saldo;
		}
		else {
			
		}
	}

	public double deposita(double ammontare) {
		saldo = saldo + ammontare;
		return saldo;
	}
}
