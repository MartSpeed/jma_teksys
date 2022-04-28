package functional_Interfaces;

public class Runn_ableDemo implements Runnable {
	// encapsulated variables = private
	// thread retirved through the runnable
	private Thread t;
	private String threadName;
	
	public Runn_ableDemo(String threadName) {
		this.threadName = threadName;
		System.out.println("Creating" + threadName);
	}
	
	// creating run method
	// how we start the program
	public void run() {
		System.out.println("Running" + threadName);
		
		try {
			for(int i =4; i > 0; i--) {
				//
				System.out.println("Thread: " + threadName + " , " + i);
				// saves the time in milliseconds
				Thread.sleep(50);
			}
			// Interrupted, past tense
		}catch(InterruptedException e) {
			System.out.println("Thread" + threadName + "Interrupted");
		}
		System.out.println("Thread " + threadName + " exiting");
	}
	
	// when does the run method start?
	public void start() {
		System.out.println("Starting " + threadName);
		
		//
		if(t == null) {
			t = new Thread (this, threadName);
			t.start();
		}
	}
}
