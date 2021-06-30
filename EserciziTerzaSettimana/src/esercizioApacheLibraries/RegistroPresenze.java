package esercizioApacheLibraries;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.io.FileUtils;

public class RegistroPresenze {
	private Map<String, Presenza> registroMese = new TreeMap<>();

	public RegistroPresenze() {
	
	}
	
	public RegistroPresenze(Map<String, Presenza> registroMese) {
		this.registroMese = registroMese;
	}

	public void aggiornaPresenza(String nome, int giorniPresenza) {
		registroMese.put(nome, new Presenza(nome, giorniPresenza));
	}

	public void printRegister() {
		for (Map.Entry<String, Presenza> p : registroMese.entrySet()) {
			System.out.println(p.getValue());
		}
	}

	private String toStringPresenza(Presenza pr) {
		String stringPresenza = pr.getNome() + "@" + pr.getGiorniPresenza();
		return stringPresenza;
	}

	private static Presenza toPresenzaString(String str) {
		String[] strs = str.split("@");
		Presenza Presenza = new Presenza(strs[0] , Integer.parseInt(strs[1]));
		return Presenza;
	}

	public void exportRegister(String nomeFile) throws IOException {
		String writeString = "";
		for (Map.Entry<String, Presenza> p : registroMese.entrySet()) {
			writeString += toStringPresenza(p.getValue()) + "#";
		}
		File file = new File("outputRegistroPresenze/"+nomeFile + ".txt");

		FileUtils.writeStringToFile(file, writeString, "UTF-8");

	}

	public static RegistroPresenze importRegister(String nomeFile) throws IOException {
		File file = new File("outputRegistroPresenze/"+nomeFile + ".txt");
		String readString = FileUtils.readFileToString(file, "UTF-8");
		String[] splitPresenza = readString.split("#");
		Map<String, Presenza> registroMese = new TreeMap<>();
		for(int i= 0; i<splitPresenza.length;i++) {
			registroMese.put(toPresenzaString(splitPresenza[i]).getNome(), toPresenzaString(splitPresenza[i]));
		}
		return new RegistroPresenze(registroMese);
	}
}
