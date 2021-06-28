package tris;

import java.util.Scanner;

public class Tris {

	private int[] riga1 = new int[3];
	private int[] riga2 = new int[3];
	private int[] riga3 = new int[3];
	private int[][] campo = { riga1, riga2, riga3 };
	private Scanner console = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Benvenuto nel gioco del tris, vinci per uscire!");

		Tris a = new Tris();
		a.aggiornaCampo();
		System.out.println();
		System.out.println();
		System.out.println("inserisci una coordinata");
		
	}

	private void aggiornaCampo() {
		for (int j = 0; j < 3; j++) {
			System.out.println();
			for (int i = 0; i < 3; i++) {
				if (campo[j][i] == 0) {
					System.out.print("[ ]");
				} else if (riga1[i] == 1) {
					System.out.print("[O]");
				} else if (riga1[i] == 2) {
					System.out.print("[X]");
				}
			}
		}
	}

	
	
}
