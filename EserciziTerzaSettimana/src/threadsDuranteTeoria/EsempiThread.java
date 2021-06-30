package threadsDuranteTeoria;

public class EsempiThread {

	public static void main(String[] args) {

		Thread t1 = new BuongiornoThread();
		Thread t2 = new BuonaseraThread();

		t1.start();
		t2.start();
		/*
		 * try { Thread.sleep(1000); } catch (InterruptedException e) {
		 * e.printStackTrace(); } System.out.println("Terminata main");
		 */
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Terminata main");
	}

}
