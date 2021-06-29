package esercizioSetHashSet;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class ParoleERipetizioni {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int a = -1;
		System.out.println("Quante parole vuoi inserire?");
		try {
			a = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Non è un numero, decido io, facciamo 5");
			a = 5;
		}finally {
			scan.nextLine();
		}

		Set<String> parole = new HashSet<>();
		Set<String> duplicate = new HashSet<>();

		for (int i = 0; i < a; i++) {
			System.out.println("Inserisci una parola");
			String parola = scan.nextLine();
			boolean added = parole.add(parola);
			if (!added) {
				duplicate.add(parola);
			}
		}
		
		for(String parola: duplicate) {
			System.out.println(parola);
		}
		
		System.out.println();

		System.out.println(parole.size());
		System.out.println();
		for(String parola: parole) {
			System.out.println(parola);
		}
	}

}
