package eserciziEccezioniConProf;
import java.util.InputMismatchException;
import java.util.Scanner;

public class eccezioniInteri {

	public static void main(String[] args) {
		int[] lista = new int[5];

		for (int i = 0; i < 5; i++) {
			lista[i] = (int) (1 + Math.random() * 10);
		}

		stampaStato(lista);

		Scanner cons = new Scanner(System.in);
		int x = 1;
		int errore = 0;
		do {
			try {
				System.out.println("Inserisci un numero");
				x = cons.nextInt();
				if (x != 0) {
					System.out.println("Dove vuoi inserirlo?");
					int y = cons.nextInt();

					lista[y] = x;

					stampaStato(lista);
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posizione non valida");
				errore++;
				if (errore > 2) {
					System.out.println("Suka");
					x = 0;
				}

			} catch (InputMismatchException r) {
				System.out.println("non è un numero");
				cons.nextLine();
				errore++;
				if (errore > 2) {
					System.out.println("Suka");
					x = 0;
				}
			}

		} while (x != 0);

	}

	public static void stampaStato(int[] lista) {
		for (int i = 0; i < 5; i++) {
			System.out.println(lista[i]);
		}
	}

}
