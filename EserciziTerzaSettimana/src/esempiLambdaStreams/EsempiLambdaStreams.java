package esempiLambdaStreams;

public class EsempiLambdaStreams {
	public static void main(String[] args) {
		Runnable r = new MyRunnable();
		Thread t1 = new Thread(r);

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("hello world!");
			}
		});
		Runnable y = new Runnable() {
			@Override
			public void run() {
				System.out.println("hello world!");
			}
		};
		Thread t3 = new Thread(y);
		
		Runnable lambda = () -> 	System.out.println("hello world!");
		
		Thread t4 = new Thread(lambda);
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
