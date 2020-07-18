package thread.priority;

public class EmailCampaing implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName());
			if(i == 5) {			
				Thread.yield();
			}
		}
	}

}
