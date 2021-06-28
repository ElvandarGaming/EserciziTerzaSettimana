package eccezioniCalcoloKmLitro;

public class CalcoloKmLitro {

	public static void main(String[] args) {

		try {
			System.out.println(calcolaKmLitro(100, 26));
		} catch (DivideByZero e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

	public static double calcolaKmLitro(double km, double litri) throws DivideByZero {
		if (litri == 0) {
			throw new DivideByZero("Un pò di benza l'avrai usata");
		}
		return km / litri;
	}

	public static double calcolaKmLitro(int km, int litri) throws DivideByZero {
		return km / litri;
	}

}
