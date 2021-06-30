package esercizioMultiThread;

import java.util.concurrent.TimeUnit;

public class ThreadCancelletto implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("#");
			try {
				TimeUnit.SECONDS.sleep(1);
				// Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
