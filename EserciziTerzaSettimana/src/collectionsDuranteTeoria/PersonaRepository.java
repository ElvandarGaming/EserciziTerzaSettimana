package collectionsDuranteTeoria;

import java.util.ArrayList;

public class PersonaRepository {
	
	public ArrayList<Persona> leggiPersone(){     //non specificare arrayList, o LinkedList, scrivere solo List, piu generale, e modificabile all'interno del metodo
		ArrayList<Persona> lista = new ArrayList<>();
		Persona personaUno = new Persona("adnrea","fort","fgr");
		lista.add(personaUno);
		return lista;
	}
}
