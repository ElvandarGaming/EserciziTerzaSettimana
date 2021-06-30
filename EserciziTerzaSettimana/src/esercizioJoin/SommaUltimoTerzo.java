package esercizioJoin;

import java.util.ArrayList;
import java.util.List;

public class SommaUltimoTerzo implements Runnable {

	private List<Integer> primo = new ArrayList<>();
	private int counter;
	private int totaleParz;

	public SommaUltimoTerzo(List<Integer> primo) {
		this.primo = primo;
		counter = setCounter();
	}

	@Override
	public void run() {
		for (int i = counter * 2; i < primo.size(); i++) {
			totaleParz = totaleParz + primo.get(i);
		}
	}

	private int setCounter() {
		return primo.size() / 3;
	}

	public int getTotaleParz() {
		return totaleParz;
	}
}
