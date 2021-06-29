package collectionsDuranteTeoria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EsempioMappa {

	public static void main(String[] args) {
		List<Integer> numeri = new ArrayList<>();
		numeri.add(3);
		numeri.add(200);
		numeri.add(-2);

		for(Integer n: numeri) {
			System.out.println(n);
		}
		Collections.sort(numeri);
		
		for(Integer n: numeri) {
			System.out.println(n);
		}
		
		
		Map<String,Persona> dizio = new HashMap<>();
		
		Persona a = new Persona("Mario","Rossi","abc");
		Persona b = new Persona("Giorgio","Verdi","xyz");
		Persona c = new Persona("Mario","Rosso","alc");
		
		dizio.put(a.getCodiceFiscale(), a);
		dizio.put(b.getCodiceFiscale(), b);
		dizio.put(c.getCodiceFiscale(), c);

		Persona x = dizio.get("abc");
		
		System.out.println(x.getCognome());
		
		for(String codice : dizio.keySet()) {
			System.out.println(codice);
			System.out.println(dizio.get(codice));
		}
		for(Persona p : dizio.values()) {
			System.out.println(p);
		}
		for(Map.Entry<String,Persona> kv : dizio.entrySet()) {
			System.out.println(kv);
			System.out.println(kv.getKey());
			System.out.println(kv.getValue());
		}
		
	}

}
