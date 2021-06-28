package eccezioniDuranteTeoria;

import java.io.FileNotFoundException;

public class EsempiEccezioni {

	public static void main(String[] args) {

		System.out.println("Inizio main");

		
		/*
		try {
			String[] f = new String[2];
			System.out.println(f[2]);

			f1();
		} catch (FileNotFoundException x) {
			System.out.println("File non trovato, contattare amministratore");
			System.out.println(x.getMessage());
			x.printStackTrace();
		}finally {
			System.out.println("Questo verrà sempre eseguito");
		}
		*/
		f1();
		System.out.println("Fine main");

	}

	public static void f1() {
		System.out.println("Inizio f1");
		try {
		f2();
		}catch(FileNotFoundException x) {
			System.out.println(x.getMessage());
		}
		System.out.println("Fine f1");

	}

	public static void f2() throws FileNotFoundException {
		System.out.println("Inizio f2");
		FileNotFoundException fe = new FileNotFoundException("Non ho trovato il file di inizializzazione");
		if (Math.random() > 0.5) {
			throw fe;
		}
		System.out.println("Fine f2");

	}

}
