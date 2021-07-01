package esercizioHashMap;

//import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RubricaTelefonica {

	// private Map<String,String> contatti = new HashMap<>();
	private Map<String, String> contatti = new TreeMap<>();

	public void addContact(String nome, String numero) {
		contatti.put(nome, numero);
	}

	public void removeContact(String nome) {
		contatti.remove(nome);
	}

	public String searchName(String numero) {

		for (Map.Entry<String, String> num : contatti.entrySet()) {
			if (num.getValue().equals(numero)) {
				return num.getKey();
			}
		}
		return "Numero non presente";
	}

	public String searchNumber(String nome) {
		return contatti.get(nome);
	}

	public void printRubrica() {
		for (Map.Entry<String, String> f : contatti.entrySet()) {
			System.out.print(f.getKey() + " ");
			System.out.println(f.getValue());
		}
	}

}
