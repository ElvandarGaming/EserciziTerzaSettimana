package esercizioJoin;


import java.util.ArrayList;
import java.util.List;

import esercizioArrayArrayList.ManeggiaInteri;

public class SommaArrayMultiThread {

	
	public static void main(String[] args){

		List<Integer> lis = ManeggiaInteri.createRandomOrderList(3);
		
		//System.out.println(lis);
		
		SommaPrimoTerzo r1 = new SommaPrimoTerzo(lis);
		SommaSecondoTerzo r2 = new SommaSecondoTerzo(lis);
		SommaUltimoTerzo r3 = new SommaUltimoTerzo(lis);
		
		//runnable non mi permette di usare getTotaleParz, senza prima aver usato instanceof
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		long a = r1.getTotaleParz()+r2.getTotaleParz()+r3.getTotaleParz();
		
		System.out.println(a);
		System.out.println(r1.getTotaleParz());
		System.out.println(r2.getTotaleParz());
		System.out.println(r3.getTotaleParz());
		
		//System.out.println(lis);
		
	}

	
}
