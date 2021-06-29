package esercizioArrayArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Random;

public class ManeggiaInteri {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scan.nextInt();

		List<Integer> lista = createList(n);
		
		System.out.println(lista);
		for (Integer num : lista) {
			System.out.println(num);
		}

		System.out.println();

		List<Integer> listaatsil = addInvertedList(lista);
		
		System.out.println(listaatsil);
		for (Integer num : listaatsil) {
			System.out.println(num);
		}
		
		System.out.println();
		
		printEvenOdd(lista,true);
	
	
	}

	public static List<Integer> createList(int n) {
		List<Integer> lista = new ArrayList<>();
		Random x = new Random();

		for (int i = 0; i < n; i++) {
			// lista.add((int) (Math.random() * 101));
			lista.add(x.nextInt(101));
		}

		Collections.sort(lista);

		return lista;
	}

	public static List<Integer> addInvertedList(List<Integer> lis) {
		List<Integer> lista = new ArrayList<Integer>();

		for (Integer num : lis) {
			lista.add(num);
		}
		ListIterator<Integer> iter = lis.listIterator(lis.size());
		while (iter.hasPrevious()) {
			lista.add(iter.previous());
		}
		return lista;
	}

	public static void printEvenOdd(List<Integer> lis, boolean p) {
		ListIterator<Integer> iter = lis.listIterator();
		if (p) {
			while (iter.hasNext()) {
				System.out.println(iter.next());
				if (iter.hasNext()) {
					iter.next();
				}
			}
		} else {
			while (iter.hasNext()) {
				iter.next();
				if (iter.hasNext()) {
					System.out.println(iter.next());
				}

			}

		}

	}
}
