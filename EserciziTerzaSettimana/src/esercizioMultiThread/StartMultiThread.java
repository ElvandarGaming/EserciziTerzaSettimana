package esercizioMultiThread;

public class StartMultiThread {

	public static void main(String[] args) {

		Runnable a = new ThreadAsterisco();
		Runnable b = new ThreadCancelletto();

		Thread m = new Thread(a);
		Thread n = new Thread(b);

		m.start();
		n.start();

	}

}
