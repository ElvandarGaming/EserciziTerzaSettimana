package eserciziEccezioniConProf;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class inputException {

	public static void main(String[] args) {
		try {
			List<String> lineFile = leggiFile("pippo.txt");
			for (int i = 0; i<lineFile.size(); i++) {
			System.out.println(lineFile.get(i));
			}
		} catch (FileNotFoundException fe) {
			System.out.println("Il file non esiste");
		} catch (IOException ioe) {
			System.out.println("Errore nella lettura del file");
		}
	}

	public static List<String> leggiFile(String fileName) throws FileNotFoundException, IOException {
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		List<String> lines = new ArrayList<String>();
		String line = null;
		while ((line = br.readLine()) != null) {
			lines.add(line);
		}
		return lines;
	}

}
