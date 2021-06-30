package esercizioApacheLibraries;

import java.io.IOException;

public class Start {

	public static void main(String[] args) {
		RegistroPresenze gennaio = new RegistroPresenze();
		
		gennaio.aggiornaPresenza("Binotto Luca", 20);
		gennaio.aggiornaPresenza("Audano Riccardo", 25);
		gennaio.aggiornaPresenza("Barbato Simone", 21);
		gennaio.aggiornaPresenza("Bucci Serena", 5);

		gennaio.printRegister();
		try {
			gennaio.exportRegister("Febbraio");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		RegistroPresenze gennaioCopia = null;
		
		try {
			gennaioCopia = RegistroPresenze.importRegister("Gennaio");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		gennaioCopia.printRegister();
	}

}
