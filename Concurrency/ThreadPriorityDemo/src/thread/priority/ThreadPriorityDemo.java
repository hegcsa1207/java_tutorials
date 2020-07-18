package thread.priority;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		Thread t1 = new Thread(new EmailCampaing());
		Thread t2 = new Thread(new DataAggregator());

		t1.setName("EmailCampaing");
		t2.setName("DataAggregator");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Inside main...");
	}

}
