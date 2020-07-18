package threads.first;

public class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside run...");
		go();
	}

	private void go() {
		System.out.println("Inside go...");
		more();
	}

	private void more() {
		System.out.println("Inside more...");
	}

}
