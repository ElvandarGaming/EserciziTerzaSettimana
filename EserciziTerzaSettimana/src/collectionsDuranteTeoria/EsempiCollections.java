package collectionsDuranteTeoria;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class EsempiCollections {

	public static void main(String[] args) {
		List<String> parole = new LinkedList<String>();
		List parole2 = new LinkedList();
		parole.add("ciccio");
		parole2.add("pippo");
		parole2.add(new Integer(4));
		parole2.add(4); // cast implicito del 4 a classe Integer
		String s = parole.get(0);
		if (parole2.get(0) instanceof String) {
			String s2 = (String) parole2.get(0);
		}
		int s3 = (int) parole2.get(1);

		f(parole);
		f(parole2);

		// g(parole);
		g(parole2);

		Pair<String, String> stringPair = new Pair<>("Pippo", "Pluto");
		Pair<String, Integer> mixedPair = new Pair<>("Pippo", 4);
		Integer it = mixedPair.getSecond();
		Pair p = new Pair("Pluto", 100);
		Integer ty = (Integer) p.getSecond();

		for (String parola : parole) {
			System.out.println(parola.length());
		}
		for(Iterator<String> x = parole.iterator(); x.hasNext();  ) {
			String parola = x.next();
			System.out.println(parola.length());
		}
		
		Persona a = new Persona("Mario","Rossi","abc");
		Persona b = new Persona("Giorgio","Verdi","xyz");
		Persona c = new Persona("Mario","Rossi","abc");
		
		Set<Persona> persone = new HashSet<>();
		persone.add(a);
		persone.add(b);
		persone.add(c);

		System.out.println(persone.size());
		
		
		
	}

	public static void f(List<String> lista) {
	}

	public static void g(List lista) {
		lista.add(22); // cast implicito del 22 a classe Integer
	}
}
