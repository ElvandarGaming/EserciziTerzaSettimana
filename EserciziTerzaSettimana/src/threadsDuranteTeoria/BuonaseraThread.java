package threadsDuranteTeoria;

public class BuonaseraThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 0 ; i<1000; i++) {
			System.out.println("Buonasera");
		}
	}
}
