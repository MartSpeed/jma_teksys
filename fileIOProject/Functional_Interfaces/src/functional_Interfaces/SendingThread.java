package functional_Interfaces;
//NOTE: always be careful of your method spelling
public class SendingThread extends Thread {
	//
	private String message;

	//
	Sender sender;

	public SendingThread(String msg, Sender send){
		//
		this.message = msg;
		this.sender = send;
	}

	// make sure our methods are running like they're supposed to
	public void run() {
		synchronized (sender) {
			sender.send(message);
		}
	}
}
