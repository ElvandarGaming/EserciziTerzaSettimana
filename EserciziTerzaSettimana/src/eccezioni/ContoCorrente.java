package eccezioni;

public class ContoCorrente {
	double saldo;
	
	
	public static void main(String[] args) {
		ContoCorrente c = new ContoCorrente();
		c.saldo= 100;
		try {
		c.ritira(50);
		System.out.println("Ho ritirato 50");
		c.ritira(51);
		System.out.println("Ho ritirato 51");
		}catch(ContoCorrenteException ce){
			System.out.println(ce.getMessage());
			System.out.println("questa operazione avrebbe realizzato un passivo di " + ce.getSforo());

		}
	}
	
	
	

	public double ritira(double ammontare) throws ContoCorrenteException{
		if(saldo>=ammontare) {
		saldo = saldo - ammontare;
		return saldo;
		}
		else {
			throw new ContoCorrenteException("non puoi sforare il saldo", ammontare - saldo);
		}
	}

	public double deposita(double ammontare) {
		saldo = saldo + ammontare;
		return saldo;
	}
}
