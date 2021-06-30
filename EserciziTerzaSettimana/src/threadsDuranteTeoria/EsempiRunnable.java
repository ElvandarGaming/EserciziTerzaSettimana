package threadsDuranteTeoria;

public class EsempiRunnable {

	public static void main(String[] args) {

		Runnable r1 = new BuongiornoRunnable();
		Runnable r2 = new BuonaseraRunnable();

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
	}

}
