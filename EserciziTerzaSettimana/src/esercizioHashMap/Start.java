package esercizioHashMap;

public class Start {

	public static void main(String[] args) {
		
		RubricaTelefonica mix = new RubricaTelefonica();
		
		mix.addContact("pippo", "049953571");
		mix.addContact("pippa", "049953572");
		mix.addContact("pippi", "049953573");
		mix.addContact("pippe", "049953574");
		mix.addContact("pippu", "049953575");
		
		mix.printRubrica();
		
		mix.removeContact("pippi");
		
		System.out.println();
		mix.printRubrica();
		
		
		
	}

}
